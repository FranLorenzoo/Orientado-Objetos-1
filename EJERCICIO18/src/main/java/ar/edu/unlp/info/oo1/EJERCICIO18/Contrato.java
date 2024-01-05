package ar.edu.unlp.info.oo1.EJERCICIO18;

import java.time.LocalDate;

public interface Contrato {
	public LocalDate getFechainicio();
	public boolean vencido();
	public double getMontoAcordado();
}
