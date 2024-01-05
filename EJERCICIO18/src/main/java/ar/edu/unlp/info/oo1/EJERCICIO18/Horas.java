package ar.edu.unlp.info.oo1.EJERCICIO18;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Horas implements Contrato{
	private String tipo;
	private LocalDate fechainicio;
	private LocalDate fechafinal;
	private double montoAcordado;
	private double horasAcordadas;
	
	public Horas (double montoAcordado, double horas, String unT, String unaFechaIni, String unaFechaFini) {
		this.fechainicio= LocalDate.parse(unaFechaIni, DateTimeFormatter.ofPattern("d/M/yyyy"));
		this.fechafinal= LocalDate.parse(unaFechaFini, DateTimeFormatter.ofPattern("d/M/yyyy"));
		this.tipo=unT;
		this.horasAcordadas=horas;
		this.montoAcordado=montoAcordado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}

	public LocalDate getFechafinal() {
		return fechafinal;
	}

	public void setFechafinal(LocalDate fechafinal) {
		this.fechafinal = fechafinal;
	}

	public double getMontoAcordado() {
		return montoAcordado;
	}

	public void setMontoAcordado(double montoAcordado) {
		this.montoAcordado = montoAcordado;
	}

	public double getHorasAcordadas() {
		return horasAcordadas;
	}

	public void setHorasAcordadas(double horasAcordadas) {
		this.horasAcordadas = horasAcordadas;
	}
	public boolean vencido() {
		if (LocalDate.now().compareTo(fechafinal)<0) {
			return false;
		}else {
			return true;
		}
	}
}
