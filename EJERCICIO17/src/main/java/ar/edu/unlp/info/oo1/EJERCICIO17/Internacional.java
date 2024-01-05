package ar.edu.unlp.info.oo1.EJERCICIO17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Internacional implements Llamada{
	private String ID="Internacional";
	private LocalDateTime fecha;
	private double duracion;
	private NumeroAsignado numero;
	private NumeroAsignado numeroRecibe;
	private String paisOrigen;
	private String paisDestino;
	
	public Internacional (String fecha, Double dura, NumeroAsignado unN, NumeroAsignado unR, String unPDes, String unPO) {
		this.duracion=dura;
		this.numero=unN;
		this.numeroRecibe=unR;
		this.paisDestino=unPDes;
		this.paisOrigen=unPO;
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

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}
	public double getFactura() {
		if ((this.fecha.getHour()>8)&&(this.fecha.getHour()<20)){
			return this.duracion*4;
		}else {
			return this.duracion*3;
		}
	}
	
}
