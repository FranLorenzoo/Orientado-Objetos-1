package ar.edu.unlp.info.oo1.EJERCICIO21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Viaje {
	private String origen;
	private String destino;
	private double costo;
	private LocalDate fecha;
	private Vehiculo auto;
	private List <Usuario> usuarios;
	
	public Viaje (Vehiculo a,String o, String d, double cos, String date) {
		this.costo=cos;
		this.auto=a;
		this.destino=d;
		this.origen=o;
		this.fecha= LocalDate.parse(date, DateTimeFormatter.ofPattern("d/M/yyyy"));
		this.usuarios=new LinkedList <Usuario>();
		this.usuarios.add(auto.getDuenio());
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Vehiculo getAuto() {
		return auto;
	}

	public void setAuto(Vehiculo auto) {
		this.auto = auto;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public double procesarEntre() {
		return this.costo/this.usuarios.size();
	}
	public void registrarPasajero (Pasajero unPasajero) {
		this.usuarios.add(unPasajero);
	}
}
