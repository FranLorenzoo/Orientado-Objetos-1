package ar.edu.unlp.info.oo1.EJERCICIO17;

public class PersonaJuridica implements Cliente {
	private String Nombre;
	private String tipoEntidad;
	private String Direccion;
	private String CUIL;
	private NumeroAsignado unNum;
	public PersonaJuridica (NumeroAsignado n,String TipoEn,String unNombre, String unaDire, String Undni) {
		this.Direccion=unaDire;
		this.CUIL=Undni;
		this.Nombre=unNombre;
		this.tipoEntidad=TipoEn;
		this.unNum=n;
	}
	
	public NumeroAsignado getUnNum() {
		return unNum;
	}

	public void setUnNum(NumeroAsignado unNum) {
		this.unNum = unNum;
	}

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTipoEntidad() {
		return tipoEntidad;
	}
	public void setTipoEntidad(String tipoEntidad) {
		this.tipoEntidad = tipoEntidad;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getCUIL() {
		return CUIL;
	}
	public void setCUIL(String cUIL) {
		CUIL = cUIL;
	}
	
}
