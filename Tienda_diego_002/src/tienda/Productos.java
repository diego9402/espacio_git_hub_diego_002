package tienda;

public class Productos {

	String idProducto;
	String nombre;
	int precio;
	
	public Productos(String idProducto, String nombre, int precio) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
