package ar.edu.unlp.info.oo1.EJERCICIO18;

public class ReciboSueldo {
	private String nombreCom;
	private String CUIL;
	private int Antiguedad;
	private double Monto;
	public ReciboSueldo (String Nombre, String Cuil, int anti, double monto) {
		this.Antiguedad=anti;
		this.CUIL=Cuil;
		this.Monto=monto;
		this.nombreCom=Nombre;
		this.Monto=this.CalcularMonto();
	}
	public double CalcularMonto () {
		if (this.Antiguedad>=20) {
			return Monto+Monto;
		}else {
			if (this.Antiguedad>=15) {
				return Monto+((Monto*70)/100);
			}else {
					if (this.Antiguedad>=10) {
						return Monto+((Monto*50)/100);
					}else {
						if (this.Antiguedad>=5) {
							return Monto+((Monto*20)/50);
						}else {
							return Monto;
						}
					}
			}
		}
	}
}
