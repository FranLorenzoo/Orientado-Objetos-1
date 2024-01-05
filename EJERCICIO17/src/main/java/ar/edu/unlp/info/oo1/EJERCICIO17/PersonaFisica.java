package ar.edu.unlp.info.oo1.EJERCICIO17;

public class PersonaFisica implements Cliente{
	private NumeroAsignado unNum;
	private String Nombre;
	private String Direccion;
	private int DNI;
	
	public PersonaFisica (NumeroAsignado n,String unNombre, String unaDire, int Undni) {
		this.Direccion=unaDire;
		this.DNI=Undni;
		this.Nombre=unNombre;
		this.unNum=n;
	}

	public NumeroAsignado getUnNum() {
		return unNum;
	}

	public void setUnNum(NumeroAsignado unNum) {
		this.unNum = unNum;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}
	
}
