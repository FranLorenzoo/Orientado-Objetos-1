package ar.edu.unlp.info.oo1.EJERCICIO17;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class NumerosAsignadosTest {
	NumerosAsignados listaTelefonica;
	Asignador asignador;
	Cliente Lu;
	Cliente Fran;

	@BeforeEach
	void setUp()throws Exception {
		asignador= new Asignador ();
		asignador.NumeroDis("221-342454");
		asignador.NumeroDis("23424545");
		Cliente Fran= asignador.darDeAltaFisica("Fran", "232213", 44960761);
		Cliente Lu= asignador.darDeAltaJuridica("Lu", "3saofs", "45297339", "empresa");
		listaTelefonica.AgregarCliente(Lu);
		listaTelefonica.AgregarCliente(Fran);
	}
	@Test
	public void TestSistema() {
		List <Cliente> lista= new LinkedList <Cliente>();
		lista.add(Lu);
		lista.add(Fran);
		assertEquals(lista, listaTelefonica);
		assertEquals()
	}
}
