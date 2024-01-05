package ar.edu.unlp.info.oo1.EJERCICIO17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Local implements Llamada{
	private String ID="Local";
	private LocalDateTime fecha;
	private double duracion;
	private NumeroAsignado numero;
	private NumeroAsignado numeroRecibe;
	
	public Local (String fecha, Double dura, NumeroAsignado unN, NumeroAsignado unR) {
		this.duracion=dura;
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
	public double getFactura () {
		return this.duracion*1;
	}
}
