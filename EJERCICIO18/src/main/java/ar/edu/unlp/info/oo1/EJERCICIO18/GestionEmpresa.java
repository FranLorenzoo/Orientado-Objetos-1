package ar.edu.unlp.info.oo1.EJERCICIO18;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GestionEmpresa {
	private List <Nomina>nominas;
	
	public GestionEmpresa() {
		this.nominas=new LinkedList <Nomina>();
	}
	
	public void añadirNomina (Nomina unaN) {
		nominas.add(unaN);
	}
	
	public List<Nomina> getNominas() {
		return nominas;
	}

	public void setNominas(List<Nomina> nominas) {
		this.nominas = nominas;
	}

	public List<Empleado> Vencidos () {
		List<Empleado> vencidos = new LinkedList <Empleado>();
		for (Iterator<Nomina> i= this.nominas.iterator(); i.hasNext();) {
			Nomina nom= i.next();
			if (nom.estaVencidoContrato()) {
				vencidos.add(nom.getEmpleado());
			}
		}
		return vencidos;
	}
	
	public List<ReciboSueldo> RecibosSueldo () {
		List <ReciboSueldo> sueldos= new LinkedList <ReciboSueldo>();
		for (Iterator<Nomina> i= this.nominas.iterator(); i.hasNext();) {
			Nomina nom= i.next();
			if (!nom.estaVencidoContrato()) {
				sueldos.add(nom.generarRecibo());
			}
		}
		return sueldos;
	}
	
	public Empleado BuscarEmpleado (String Cuil) {
		Nomina n= this.nominas.stream().filter(a-> a.getEmpleado().getCUIL().equals(Cuil)).findFirst().orElse(null);
		Empleado empleado= n.getEmpleado();
		return empleado;
	}
}
