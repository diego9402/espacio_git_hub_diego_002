package tienda;

import java.util.Scanner;
import java.util.Calendar;

public class Principal {

	private static Scanner teclado;

	public static void main(String[] args){
		
		teclado = new Scanner(System.in);
		String atributo;
		Calendar fecha = Calendar.getInstance();
		
		Productos prod1 = new Productos("P1", "Libro", 12);
		Productos prod2 = new Productos("P2", "Revista", 23);
		Productos prod3 = new Productos("P3", "Manual", 9);
		
		Vendedores vend1 = new Vendedores("V1", "Jose");
		Vendedores vend2 = new Vendedores("V2", "Ruben");
		Vendedores vend3 = new Vendedores("V3", "Marta");
		
		Tiendas tiend1 = new Tiendas("T1", "Eroski");
		Tiendas tiend2 = new Tiendas("T2", "DIA");
		Tiendas tiend3 = new Tiendas("T3", "Mercadona");
		
		Clientes clien1 = new Clientes("C1", "Manuel");
		Clientes clien2 = new Clientes("C2", "Ricardo");
		Clientes clien3 = new Clientes("C3", "Elena");
		
		Venta venta1 = new Venta();
		
		
		System.out.println("Introduzca el ID del cliente: ");
		
		atributo = teclado.next();
		
		venta1.setId_cliente(atributo);
		
		
		System.out.println("Introduzca el ID del producto: ");
		
		atributo = teclado.next();
		
		venta1.setId_Producto(atributo);
		
		
		System.out.println("Introduzca el ID del vendedor: ");
		
		atributo = teclado.next();
		
		venta1.setId_Vendedor(atributo);
		
		
		System.out.println("Introduzca el ID de la tienda: ");
		
		atributo = teclado.next();
		
		venta1.setIdTienda(atributo);
		
		int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        
        venta1.setFechaHora(dia + "/" + (mes+1) + "/" + año+"   "+hora+":"+ minuto+":"+segundo);

		
		
	}
}
