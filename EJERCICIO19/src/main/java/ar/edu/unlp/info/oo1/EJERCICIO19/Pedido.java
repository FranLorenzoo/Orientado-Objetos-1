package ar.edu.unlp.info.oo1.EJERCICIO19;

public class Pedido {
	private String tipoEnvio;
	private String formaDePago;
	private Producto producto;
	private Cliente cliente;
	private int cantidad;
	public Pedido(String tipoEnvio, String formaDePago, int cant, Producto prod, Cliente cli) {
		this.tipoEnvio = tipoEnvio;
		this.formaDePago = formaDePago;
		this.cantidad= cant;
		this.cliente=cli;
		this.producto= prod;
	}
	
	private double calcularporTipo() {
		if (this.formaDePago=="Cuotas") {
			return this.producto.getPrecio()*((20*(this.producto.getPrecio()))/100);
		}else {
			return this.producto.getPrecio();
		}
	}
	
	private double calcularporFormaEnvio () {
		switch (this.tipoEnvio) {
		case "retirar en sucursal de correo":
			return this.calcularporTipo()+50;
		case "express a domicilio":
			return this.calcularporTipo()*(100*0.5);
		default:
			return this.calcularporTipo();
		}
	}
	public double calcularCosto() {
		return this.calcularporFormaEnvio();
	}
}
