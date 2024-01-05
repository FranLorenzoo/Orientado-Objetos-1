package ar.edu.unlp.info.oo1.EJERCICIO15;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
	private String DNI;
	private String nombre;
	private String direccion;
	private List <Reserva> reservas;
	private int alquileres;
	
	public Usuario (String unD, String unN, String unaDire) {
		DNI=unD;
		nombre=unN;
		direccion=unaDire;
		reservas= new LinkedList <Reserva>();
		alquileres=0;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public int getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(int alquileres) {
		this.alquileres = alquileres;
	}
	
	public List reservasEntre (LocalDate ini, LocalDate fin) {
		List <Reserva> aux = this.reservas.stream().filter(res -> (res.getFechaInicio().getDayOfYear() >= ini.getDayOfYear())&&(res.getFechaFinal().getDayOfYear()<=fin.getDayOfYear())).collect(Collectors.toList()); 
		return aux;
	}
	public void EliminarReserva (Reserva unaReserva) {
		this.reservas.remove(unaReserva);
	}
	public void Reservar (Reserva unaReserva) {
		this.reservas.add(unaReserva);
	}
}
