package ar.edu.unlp.info.oo1.EJERCICIO17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Interlocal implements Llamada{
	private String ID="Interlocal";
	private LocalDateTime fecha;
	private double duracion;
	private NumeroAsignado numero;
	private NumeroAsignado numeroRecibe;
	private double distancia;
	
	public Interlocal (double distancia, String fecha, Double dura, NumeroAsignado unN, NumeroAsignado unR) {
		this.duracion=dura;
		this.distancia=distancia;
		this.numero=unN;
		this.numeroRecibe=unR;
		this.fecha= LocalDateTime.parse(fecha, DateTimeFormatter.ofPattern("yyyy/M/dTh:M:S"));
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public NumeroAsignado getNumero() {
		return numero;
	}

	public void setNumero(NumeroAsignado numero) {
		this.numero = numero;
	}

	public NumeroAsignado getNumeroRecibe() {
		return numeroRecibe;
	}

	public void setNumeroRecibe(NumeroAsignado numeroRecibe) {
		this.numeroRecibe = numeroRecibe;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public double getFactura() {
		if (this.distancia>500) {
			return this.distancia*this.duracion*3;
		}else {
			if (this.distancia>100) {
				return this.distancia*this.duracion*2.5;
			}else {
				return this.distancia*this.duracion*2;
			}
		}
	}
}
