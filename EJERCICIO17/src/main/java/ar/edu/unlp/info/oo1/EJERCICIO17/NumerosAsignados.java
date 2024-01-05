package ar.edu.unlp.info.oo1.EJERCICIO17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosAsignados {
	private List <Cliente>clientes;
	public NumerosAsignados () {
		clientes= new LinkedList <Cliente>();
	}
	public void AgregarCliente (Cliente unCLiente) {
		this.clientes.add(unCLiente);
	}
	public double facturar (String unaFechaini, String unaFechaFIn, Cliente unCLI) {
		LocalDateTime inicio= LocalDateTime.parse(unaFechaini, DateTimeFormatter.ofPattern("yyyy/M/dTh:M:S"));
		LocalDateTime fin= LocalDateTime.parse(unaFechaFIn, DateTimeFormatter.ofPattern("yyyy/M/dTh:M:S"));
		Cliente aFacturar= clientes.stream().filter(cli-> cli.equals(unCLI)).findFirst().orElse(null);
		List <Llamada>llamadas= aFacturar.getUnNum().getRegistroDeLlamadas().stream().filter(llam -> (llam.getFecha().isAfter(inicio))&&(llam.getFecha().isBefore(fin))).collect(Collectors.toList());
		double monto=0;
		for (Iterator<Llamada> i= llamadas.iterator();i.hasNext();) {
				Llamada llamada=i.next();
				monto+=llamada.getFactura();
		}
		return monto;
	}
}
