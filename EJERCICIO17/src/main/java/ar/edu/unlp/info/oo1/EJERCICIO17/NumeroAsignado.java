package ar.edu.unlp.info.oo1.EJERCICIO17;

import java.util.LinkedList;
import java.util.List;

public class NumeroAsignado {
	private List <Llamada> registroDeLlamadas;
	private String NumeroTel;
	public NumeroAsignado ( String unNum) {
		this.NumeroTel=unNum;
		this.registroDeLlamadas= new LinkedList <Llamada>();
	}
	public void RegistrarLlamada (Llamada unaLLam) {
		this.registroDeLlamadas.add(unaLLam);
	}
	public List<Llamada> getRegistroDeLlamadas() {
		return this.registroDeLlamadas;
	}
	public void setRegistroDeLlamadas(List<Llamada> registroDeLlamadas) {
		this.registroDeLlamadas = registroDeLlamadas;
	}
	public String getNumeroTel() {
		return NumeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		NumeroTel = numeroTel;
	}

}
