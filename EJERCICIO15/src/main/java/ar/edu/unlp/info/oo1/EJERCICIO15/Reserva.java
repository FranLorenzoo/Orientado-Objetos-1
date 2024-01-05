package ar.edu.unlp.info.oo1.EJERCICIO15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
	private Propiedad propiedad;
	private LocalDate fechaInicio;
	private LocalDate fechaFinal;
	private Usuario usuario;
	public Reserva (Propiedad unaP, String unaFI, String unaFF, Usuario unUser) {
		IntervaloFechas fechas= new IntervaloFechas(unaFI, unaFF);
		usuario=unUser;
		propiedad= unaP;
		propiedad.getOcupado().add(fechas);
	}
	public Propiedad getPropiedad() {
		return propiedad;
	}
	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public double calcularPrecio () {
		int dias;
		if (fechaFinal.getYear()>fechaInicio.getYear()) { 
			dias= this.fechaFinal.getDayOfYear() + (365- this.fechaInicio.getDayOfYear())+ ((this.fechaFinal.getYear ()- this.fechaInicio.getYear())-1)*365;
		}else {
			dias= this.fechaFinal.getDayOfYear() - this.fechaInicio.getDayOfYear();
		}
		return dias*propiedad.getPrecioNoche();
	}
	public double CalcularDevolucion () {
		switch (this.propiedad.getPoliticaCancelacion()) {
			case "Flexible":
				return this.calcularPrecio();
			case "Moderada":
				return this.CalcularDevolucion()/2;
			case "Estricta":
				return 0;
			default:
				return 0;
		}
	}
}
