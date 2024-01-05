package ar.edu.unlp.info.oo1.EJERCICIO17;

import java.util.LinkedList;
import java.util.List;

public class Asignador {
	private List <String>numeroDis;
	
	public Asignador () {
		this.numeroDis= new LinkedList <String>();
	}
	public void NumeroDis (String UnNum) {
		this.numeroDis.add(UnNum);
	}
	
	public Cliente darDeAltaFisica (String unNombre,String unDir, int UnDNi) {
		NumeroAsignado unNum= new NumeroAsignado(this.numeroDis.get(0));
		Cliente unCli= new PersonaFisica (unNum,unNombre,unDir, UnDNi);
		this.numeroDis.remove(0);
		return unCli;
	}
	public Cliente darDeAltaJuridica (String unNombre,String unDir, String unCuil, String unTipo) {
		NumeroAsignado unNum= new NumeroAsignado(this.numeroDis.get(0));
		Cliente unCli= new PersonaJuridica (unNum,unTipo,unDir, unNombre,unCuil);
		this.numeroDis.remove(0);
		return unCli;
	}
}
