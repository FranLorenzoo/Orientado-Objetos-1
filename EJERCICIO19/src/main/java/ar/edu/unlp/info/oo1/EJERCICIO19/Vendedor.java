package ar.edu.unlp.info.oo1.EJERCICIO19;

public class Vendedor {
	private String Nombre;
	private String Direccion;
	public Vendedor(String nombre, String direccion) {
		Nombre = nombre;
		Direccion = direccion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
}
