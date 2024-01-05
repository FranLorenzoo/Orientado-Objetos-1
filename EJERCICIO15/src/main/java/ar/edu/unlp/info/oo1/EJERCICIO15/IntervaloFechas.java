package ar.edu.unlp.info.oo1.EJERCICIO15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IntervaloFechas {
	private LocalDate FechaInicial;
	private LocalDate FechaFinal;
	
	public IntervaloFechas (String Ini, String Fini) {
		this.FechaInicial= LocalDate.parse(Ini, DateTimeFormatter.ofPattern("d/M/yyyy"));
		this.FechaFinal= LocalDate.parse(Fini, DateTimeFormatter.ofPattern("d/M/yyyy"));
	}

	public LocalDate getFechaInicial() {
		return FechaInicial;
	}

	public void setFechaInicial(LocalDate fechaInicial) {
		FechaInicial = fechaInicial;
	}

	public LocalDate getFechaFinal() {
		return FechaFinal;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		FechaFinal = fechaFinal;
	}
	
}
