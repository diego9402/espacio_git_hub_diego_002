package tienda;

public class Venta {

	String id_cliente;
	String id_Producto;
	String id_Vendedor;
	String idTienda;
	String fechaHora;
	
	

	public Venta() {
		super();
	}

	public String getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(String id_Producto) {
		this.id_Producto = id_Producto;
	}

	public String getId_Vendedor() {
		return id_Vendedor;
	}

	public void setId_Vendedor(String id_Vendedor) {
		this.id_Vendedor = id_Vendedor;
	}

	public String getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(String idTienda) {
		this.idTienda = idTienda;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

}
