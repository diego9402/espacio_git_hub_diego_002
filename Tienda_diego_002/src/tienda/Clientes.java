package tienda;

public class Clientes {

	String idCliente;
	String nombre;
	
	
	public Clientes(String idCliente, String nombre) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
