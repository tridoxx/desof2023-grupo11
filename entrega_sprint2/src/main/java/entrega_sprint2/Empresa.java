package entrega_sprint2;

public class Empresa {
//atributos
	private String nombreEmpresa;
	private String direccionEmpresa;
	private int telefonoEmpresa;
	private String nitEmpresa;
	public Empresa(String nombreEmpresa, String direccionEmpresa, int telefonoEmpresa, String nitEmpresa) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
		this.nitEmpresa = nitEmpresa;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}
	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}
	public int getTelefonoEmpresa() {
		return telefonoEmpresa;
	}
	public void setTelefonoEmpresa(int telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}
	public String getNitEmpresa() {
		return nitEmpresa;
	}
	public void setNitEmpresa(String nitEmpresa) {
		this.nitEmpresa = nitEmpresa;
	}



	
	
	
}
