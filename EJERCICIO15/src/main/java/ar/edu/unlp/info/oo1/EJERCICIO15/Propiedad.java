package ar.edu.unlp.info.oo1.EJERCICIO15;

import java.util.LinkedList;
import java.util.List;

public class Propiedad {
	private String nombre;
	private String Direccion;
	private String descripcion;
	private Usuario propietario;
	private double precioNoche;
	private List <IntervaloFechas> ocupado;
	private String PoliticaCancelacion;
	public Propiedad (String unN, String unaD, String unaDes, Usuario unP, double unpre, String Poli) {
		this.ocupado=new LinkedList <IntervaloFechas> ();
		precioNoche= unpre;
		nombre= unN;
		Direccion= unaD; 
		descripcion= unaDes;
		propietario= unP;
		this.PoliticaCancelacion=Poli;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Usuario getPropietario() {
		return propietario;
	}
	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}
	public double getPrecioNoche() {
		return precioNoche;
	}
	public void setPrecioNoche(double precioNoche) {
		this.precioNoche = precioNoche;
	}
	public List<IntervaloFechas> getOcupado() {
		return ocupado;
	}
	public void setOcupado(List<IntervaloFechas> ocupado) {
		this.ocupado = ocupado;
	}
	public String getPoliticaCancelacion() {
		return PoliticaCancelacion;
	}
	public void setPoliticaCancelacion(String politicaCancelacion) {
		PoliticaCancelacion = politicaCancelacion;
	}
	
	
}
