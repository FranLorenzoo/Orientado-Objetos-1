package ar.edu.unlp.info.oo1.EJERCICIO18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Empleado {
	private List <Contrato> contratos;
	private String CUIL;
	private String NombreCom;
	private LocalDate FechaNacimiento;
	private boolean conyugue;
	private boolean hijos;
	
	public Empleado(String cUIL, String nombreCom, String fechaNacimiento,
			boolean conyugue, boolean hijos) {
		this.contratos= new LinkedList<Contrato>();

		CUIL = cUIL;
		NombreCom = nombreCom;
		FechaNacimiento = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("d/M/yyyy"));
		this.conyugue = conyugue;
		this.hijos = hijos;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

	public String getNombreCom() {
		return NombreCom;
	}

	public void setNombreCom(String nombreCom) {
		NombreCom = nombreCom;
	}

	public String getCUIL() {
		return CUIL;
	}

	public void setCUIL(String cUIL) {
		CUIL = cUIL;
	}

	public boolean isConyugue() {
		return conyugue;
	}

	public void setConyugue(boolean conyugue) {
		this.conyugue = conyugue;
	}

	public boolean isHijos() {
		return hijos;
	}

	public void setHijos(boolean hijos) {
		this.hijos = hijos;
	}
	
	public Contrato getContratoVigente () {
		Contrato con;
		if (this.getContratos().size()>1) {
			con= this.getContratos().stream().min((cont1, cont2) -> cont1.getFechainicio().compareTo(cont2.getFechainicio())).orElse(null);
		}else {
			con= this.getContratos().get(0);
		}
		return con;
	}
	
}
