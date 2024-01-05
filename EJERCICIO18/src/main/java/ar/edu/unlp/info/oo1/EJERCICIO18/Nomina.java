package ar.edu.unlp.info.oo1.EJERCICIO18;

import java.time.LocalDate;
import java.util.Comparator;


public class Nomina {
	private LocalDate fechaInicio;
	private Empleado empleado;
	public Nomina() {
		
	}
	
	public void Alta(String CUIL, String Nombre, String FechaNacimiento, boolean conyugue, boolean hijos) {
		this.empleado= new Empleado (CUIL, Nombre, FechaNacimiento,conyugue, hijos);
		this.fechaInicio=LocalDate.now();
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	public void CargarContrato (Contrato unCont) {
		this.empleado.getContratos().add(unCont);
	}
	
	public boolean estaVencidoContrato () {
		boolean vencido =false;
		Contrato con;
		if (this.empleado.getContratos().size()>1) {
			con= this.empleado.getContratos().stream().min((cont1, cont2) -> cont1.getFechainicio().compareTo(cont2.getFechainicio())).orElse(null);
		}else {
			con= this.empleado.getContratos().get(0);
		}
		return con.vencido();
	}
	public ReciboSueldo generarRecibo() {
		ReciboSueldo suel= new ReciboSueldo(this.empleado.getNombreCom(), this.empleado.getCUIL(), this.fechaInicio.getYear(), this.empleado.getContratoVigente().getMontoAcordado());
		return suel;
	}
	
}
