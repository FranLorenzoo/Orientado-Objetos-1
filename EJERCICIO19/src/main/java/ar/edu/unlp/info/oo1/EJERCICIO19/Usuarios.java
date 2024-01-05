package ar.edu.unlp.info.oo1.EJERCICIO19;

import java.util.LinkedList;
import java.util.List;

public class Usuarios {
	private List <Vendedor> vendedores;
	private List <Cliente> clientes;
	public Usuarios() {
		this.clientes= new LinkedList <Cliente>();
		this.vendedores= new LinkedList <Vendedor>();
	}
	
	
	public List<Vendedor> getVendedores() {
		return vendedores;
	}


	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}


	public List<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}


	public Vendedor crearVendedor (String Nm, String Dir) {
		Vendedor ven= new Vendedor (Nm, Dir);
		this.vendedores.add(ven);
		return ven;
	}
	
	public Cliente crearCliente (String nm, String dr) {
		Cliente cli= new Cliente (nm, dr);
		this.clientes.add(cli);
		return cli;
	}
	
	public Cliente BuscarCliente (String Nom) {
		Cliente retornar= this.clientes.stream().filter(cli-> cli.getNombre().equals(Nom)).findFirst().orElse(null);
		return retornar;
	}
	
	public Vendedor BuscarVendedor (String Nom) {
		Vendedor retornar= this.vendedores.stream().filter(ven-> ven.getNombre().equals(Nom)).findFirst().orElse(null);
		return retornar;
	}
}
