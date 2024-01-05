package ar.edu.unlp.info.oo1.EJERCICIO15;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class SistemaTest {
	Sistema sistema;
	Usuario Fran, Lu;
	Propiedad LaMaria, Jorge;
	@BeforeEach
	void setUp()throws Exception{
		sistema = new Sistema ();
		Fran= new Usuario ("44960761", "Juan Francisco","12 n*1220");
		Lu= new Usuario ("45297339", "Lucia Eseiza", "12 n*1220");
		LaMaria= new Propiedad ("LaMaria", "aldn", "hola",Fran, 20000);
		Jorge= new Propiedad ("Oikawa", "sofsob", "hermosa",Lu,30000);
		sistema.RegistrarUsuario(Fran);
		sistema.RegistrarUsuario(Lu);
		sistema.RegistrarPropiedad(Jorge);
		sistema.RegistrarPropiedad(LaMaria);
	}
	@Test
	public void TestRegistrarUsuario() {
		List <Usuario>eq= new LinkedList<Usuario>();
		eq.add(Fran);
		eq.add(Lu);
		assertEquals(eq,sistema.getUsuarios());
	}
	
	@Test
	public void TestRegistrarProp() {
		List <Propiedad>eq=new LinkedList<Propiedad>();
		eq.add(Jorge);
		eq.add(LaMaria);		
		assertEquals(eq, sistema.getPropiedades());
	}
	@Test
	public void TestReserva(){
		Reserva nuevaReserva=new Reserva (Jorge, "20/11/2023", "25/11/2023",Fran);
		List<Propiedad>eq=new LinkedList <Propiedad>();
		sistema.HacerReserva(nuevaReserva);
		eq.add(LaMaria);
		assertEquals(eq, sistema.PropsDispos("20/11/2023", "25/11/2023"));
		assertEquals(150000,sistema.calcularIngresos(Lu, "19/11/2023", "26/11/2023"));
	}
}
