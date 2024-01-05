package ar.edu.unlp.info.oo1.EJERCICIO18;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Planta implements Contrato{
	private String tipo;
	private LocalDate fechainicio;
	private double montoAcordado;
	private double montoPorConyugue;
	private double montoPorHijo;
	
	public Planta (double montoAcordado,double hijo,  String unT, String unaFechaIni, double montoPorCon) {
		this.fechainicio= LocalDate.parse(unaFechaIni, DateTimeFormatter.ofPattern("d/M/yyyy"));
		this.tipo=unT;
		this.montoPorConyugue=montoPorCon;
		this.montoPorHijo=hijo;
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

	public double getMontoAcordado() {
		return montoAcordado;
	}

	public void setMontoAcordado(double montoAcordado) {
		this.montoAcordado = montoAcordado;
	}

	public double getMontoPorConyugue() {
		return montoPorConyugue;
	}

	public void setMontoPorConyugue(double montoPorConyugue) {
		this.montoPorConyugue = montoPorConyugue;
	}

	public double getMontoPorHijo() {
		return montoPorHijo;
	}

	public void setMontoPorHijo(double montoPorHijo) {
		this.montoPorHijo = montoPorHijo;
	}
	
	public boolean vencido() {
		return false;
	}
}
