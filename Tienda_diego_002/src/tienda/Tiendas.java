package tienda;

public class Tiendas {

	String idTienda;
	String nombre;
	
	
	public Tiendas(String idTienda, String nombre) {
		super();
		this.idTienda = idTienda;
		this.nombre = nombre;
	}
	public String getIdTienda() {
		return idTienda;
	}
	public void setIdTienda(String idTienda) {
		this.idTienda = idTienda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
