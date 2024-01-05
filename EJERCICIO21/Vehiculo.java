package ar.edu.unlp.info.oo1.EJERCICIO21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vehiculo {
	private Conductor duenio;
	private double precioMercado;
	private int capacidad;
	private String descripcion;
	private LocalDate anioFabricacion;
	public Vehiculo (String anioF,String des, int cap, double valor, Conductor due) {
		this.anioFabricacion= LocalDate.parse(anioF, DateTimeFormatter.ofPattern("d/M/yyyy"));
		this.capacidad=cap;
		this.descripcion=des;
		this.duenio=due;
		this.precioMercado=valor;
	}
	public Conductor getDuenio() {
		return duenio;
	}
	public void setDuenio(Conductor duenio) {
		this.duenio = duenio;
	}
	public double getPrecioMercado() {
		return precioMercado;
	}
	public void setPrecioMercado(double precioMercado) {
		this.precioMercado = precioMercado;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(LocalDate anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	
}
