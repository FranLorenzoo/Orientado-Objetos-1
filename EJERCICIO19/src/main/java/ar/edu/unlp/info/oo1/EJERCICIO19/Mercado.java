package ar.edu.unlp.info.oo1.EJERCICIO19;

import java.util.LinkedList;
import java.util.List;

public class Mercado {
	private Usuarios usuarios;
	private List<Pedido> pedidos;
	private List <Venta> ventas;
	private List<Producto>productos;
	
	public Mercado () {
		this.pedidos= new LinkedList <Pedido>();
		this.productos= new LinkedList <Producto>();
		this.ventas= new LinkedList <Venta>();
		this.usuarios= new Usuarios();
	}
	public void AgregarCliente (String Nombre, String dire) {
		this.usuarios.crearCliente(Nombre, dire);
	}
	public void AgregarVendedor (String Nombre, String dire) {
		this.usuarios.crearVendedor(Nombre, dire);
	}
	
	public Venta PonerProductoVenta (String Nom, String Des, double pre, int sto, Vendedor ven) {
		Producto prod= new Producto (Nom, Des, pre, sto);
		Venta vent= new Venta (prod, ven);
		this.ventas.add(vent);
		return vent;
	}
	
	public void agregarPerdido (String tipoEn, String TipoPago,String Nom, String Des, double pre, int sto, int cant, Cliente cli) {
		Producto prod= new Producto (Nom, Des, pre, sto);
		Pedido vent=null;
		if (prod.getStock()>= cant) {
			vent = new Pedido (tipoEn, TipoPago,cant,prod, cli);
			this.pedidos.add(vent);
		}
	}
	
	public double CostoTotal (Pedido unP) {
		return unP.calcularCosto();
	}
	
	public void agregarProducto (Producto unP) {
		this.productos.add(unP);
	}
	public Producto BuscarPedido (Producto unP) {
		Producto retornar= this.productos.stream().filter(pe->pe.equals(unP)).findFirst().orElse(null);
		return retornar;
	}
}
