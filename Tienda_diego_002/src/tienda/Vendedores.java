package tienda;

public class Vendedores {

	String idVendedor;
	String nombre;
	
	
	public Vendedores(String idVendedor, String nombre) {
		super();
		this.idVendedor = idVendedor;
		this.nombre = nombre;
	}
	public String getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(String idVendedor) {
		this.idVendedor = idVendedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
