package ar.edu.unlp.info.oo1.EJERCICIO19;

public class Producto {
	private String Nombre;
	private String Descripcion;
	private double precio;
	private int stock;
	public Producto(String nombre, String descripcion, double precio, int stock) {
		Nombre = nombre;
		Descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
