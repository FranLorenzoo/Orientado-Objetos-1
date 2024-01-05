package ar.edu.unlp.info.oo1.EJERCICIO15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Sistema {
	private List <Usuario> usuarios;
	private List <Propiedad> propiedades;
	public Sistema () {
		this.usuarios= new LinkedList <Usuario>();
		this.propiedades= new LinkedList <Propiedad>();
	} 
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(List<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}

	public void RegistrarUsuario (Usuario user) {
		usuarios.add(user);
	}
	
	public void RegistrarPropiedad (Propiedad prop) {
		propiedades.add(prop);
	}
	
	public List obtenerReservas (String usuario) {
		Usuario user= this.usuarios.stream().filter(usuar -> usuar.getNombre().equals(usuario)).findFirst().orElse(null);
		return user.getReservas();
	}
	
	public void HacerReserva (Reserva unaReserva) {
		Usuario user= this.usuarios.stream().filter(usuar -> usuar.equals(unaReserva.getUsuario())).findFirst().orElse(null);
		user.Reservar(unaReserva);
	}
	
	public List PropsDispos (String ini, String fin) {
		LocalDate fechaInicio= LocalDate.parse(ini, DateTimeFormatter.ofPattern("d/M/yyyy"));
		LocalDate fechaFinal= LocalDate.parse(fin, DateTimeFormatter.ofPattern("d/M/yyyy"));
		List <Propiedad> disponibles= new LinkedList<Propiedad>();
		for (Iterator <Propiedad> p= propiedades.iterator();p.hasNext();) {	
			Reserva bool=null;
			Propiedad prop=p.next();
			for (Iterator<Usuario> i= usuarios.iterator(); i.hasNext();) {
				Usuario aux= i.next();
				List <Reserva> reservas= aux.reservasEntre(fechaInicio, fechaFinal);
				bool= reservas.stream().filter(res -> res.getPropiedad().equals(prop)).findFirst().orElse(null);			
				if (bool !=null) {
					break;
				}
			}
			if (bool==null) {
				disponibles.add(prop);
			}
		}
		return disponibles;
	}
	public double calcularIngresos (Usuario prop,String ini, String fin) {
		LocalDate fechaInicio= LocalDate.parse(ini, DateTimeFormatter.ofPattern("d/M/yyyy"));
		LocalDate fechaFinal= LocalDate.parse(fin, DateTimeFormatter.ofPattern("d/M/yyyy"));
		double monto=0;
		for (Iterator<Usuario> i= usuarios.iterator(); i.hasNext();) {
			Usuario aux= i.next();
			List <Reserva> reservas= aux.reservasEntre(fechaInicio, fechaFinal);
			for (Iterator<Reserva>b= reservas.iterator(); b.hasNext();) {
				Reserva Res = b.next();
				monto += Res.calcularPrecio();
			}
		}
		return monto;
	}
	public Propiedad DarDeAlta (Propiedad Alta) {
		this.propiedades.remove(Alta);
		return Alta;
	}
}
