package ar.edu.unlp.info.oo1.EJERCICIO18;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class GestionEmpresaTest {
	GestionEmpresa Empresa;
	Nomina Juan= new Nomina ();
	Nomina Francisco= new Nomina ();
	Nomina Lorenzo= new Nomina ();
	Contrato Juani= new Horas (20000, 100, "Horas", "8/8/2020","3/3/2023");
	@BeforeEach
	void setUp() throws Exception{
		Empresa= new GestionEmpresa ();
		Juan.Alta("349840324", "Juan", "10/12/2000", false, false);
		Francisco.Alta("234", "Francisco", "8/8/2003", true, true);
		Lorenzo.Alta("q2304", "Lorenzo", "2/2/2001", false, false);
		Contrato Fran= new Planta (20000, 100, "Planta", "8/8/2020",200);
		
		Contrato Lore= new Horas (20000, 100, "Horas", "8/8/2020","3/3/2024");
		Francisco.CargarContrato(Fran);
		Juan.CargarContrato(Juani);
		Lorenzo.CargarContrato(Lore);
		Empresa.añadirNomina(Francisco);
		Empresa.añadirNomina(Juan);
		Empresa.añadirNomina(Lorenzo);
	}
	
	@Test
	public void TestGestion () {
		GestionEmpresa em= new GestionEmpresa ();
		List<Empleado>vencidos= new LinkedList <Empleado>();
		vencidos.add(Juan.getEmpleado());
		em.añadirNomina(Francisco);
		em.añadirNomina(Juan);
		em.añadirNomina(Lorenzo);
		assertEquals (3, Empresa.getNominas().size());
		assertEquals (true, vencidos.equals(Empresa.Vencidos()));
		assertEquals (Francisco.getEmpleado(), Empresa.BuscarEmpleado("234"));
	}
}
