package ar.edu.unlp.info.oo1.EJERCICIO21;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Poolcar { 
	private List <Usuario> usuarios;
	private List <Viaje> viajes;
	
	public Poolcar () {
		usuarios= new LinkedList <Usuario>();
		viajes= new LinkedList <Viaje>();
	}
	
	public Usuario darAltaPasajero (String nom) {
		Usuario pasajero = new Pasajero (nom);
		this.usuarios.add(pasajero);
		return pasajero;
	}
	
	public Usuario darAltaConductor (String nom, Vehiculo vehi) {
		Usuario conductor= new Conductor (nom, vehi);
		this.usuarios.add(conductor);
		return conductor;
	}
	
	public Viaje altaViaje (String origen, String destino, double costo, Vehiculo auto, String date) {
		Viaje viaje = new Viaje (auto, origen, destino, costo, date);
		this.viajes.add(viaje);
		return viaje;
	}
	public void cargarSaldo (Usuario user, double Saldo) {
		user.cargarSaldo(Saldo);
	}
	public List<Usuario> usuariosRegistrados (){
		return this.usuarios;
	}
	public List<Viaje>comienzaMañana (){
		List<Viaje> mañana= this.viajes.stream().filter(v-> (v.getFecha().getDayOfYear()>LocalDate.now().getDayOfYear())&&(v.getFecha().getDayOfYear()<(LocalDate.now().getDayOfYear()+2))).collect(Collectors.toList());
		return mañana;
	}
	public void ProcesarViajesMañana () {
		List<Viaje>mañana=this.comienzaMañana();
		for (Iterator<Viaje>i= mañana.iterator();i.hasNext();) {
			Viaje unViaje= i.next();
			unViaje.procesarEntre();
			for (Iterator<Usuario>u= unViaje.getUsuarios().iterator();u.hasNext();) {
				Usuario viajante = u.next();
				viajante.getBonificacion();
			}
		}
	}
	public void registrarPasajero (Pasajero pasajero, Viaje unviaje) {
		if (unviaje.getFecha().getDayOfYear()>(LocalDate.now().getDayOfYear()+2)) {
			if ((pasajero.getSaldo()-unviaje.procesarEntre())>0) {
				unviaje.registrarPasajero(pasajero);
			}
		}
	}
	public void regalarSaldo (double unSaldo) {
		for (Iterator<Usuario>u=this.usuarios.iterator();u.hasNext();) {
			Usuario user= u.next();
			user.recibirRegalo(unSaldo);
		}
	}
}
