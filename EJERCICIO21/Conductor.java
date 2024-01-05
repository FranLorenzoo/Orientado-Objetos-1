package ar.edu.unlp.info.oo1.EJERCICIO21;

public class Conductor implements Usuario{
	private Vehiculo auto;
	private String nombre;
	private double saldo;
	
	public Conductor (String Nom, Vehiculo vehi) {
		this.auto=vehi;
		this.nombre=Nom;
		this.saldo=0;
	}
	
	public void cargarSaldo(double saldo) {
		if (this.auto.getAnioFabricacion().getDayOfYear()>5) {
			this.saldo+= saldo-((10*saldo)/100);
		}else {
			this.saldo+= saldo-(saldo/100);
		}
	}

	public Vehiculo getAuto() {
		return auto;
	}

	public void setAuto(Vehiculo auto) {
		this.auto = auto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void getBonificacion () {
		this.saldo+= ((this.auto.getPrecioMercado()*0.1)/100);
	}
	public void recibirRegalo(double s) {
		this.saldo+= s;
	}
}
