package ar.edu.unlp.info.oo1.EJERCICIO21;

import java.time.LocalDate;
import java.util.List;

public class Pasajero implements Usuario{
	private String nombre;
	private double saldo;
	private List<Viaje>viajes;
	
	public Pasajero (String Nom) {
		this.nombre=Nom;
		this.saldo=0;
	}
	public boolean hiceViajeMes() {
		if (this.viajes.get(this.viajes.size()-1).getFecha().getMonthValue() < (LocalDate.now().getMonthValue()-1)) {
			return true;
		}else {
			return false;
		}
	}
	public void cargarSaldo (double saldo) {
		if (this.hiceViajeMes()) {
			this.saldo+= saldo-((10*saldo)/100);
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void getBonificacion () {
		if (this.hiceViajeMes()) {
			this.saldo+= 500;
		}
	}
	public void recibirRegalo(double s) {
		this.saldo+= s;
	}
}
