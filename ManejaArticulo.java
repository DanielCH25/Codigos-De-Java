package MisProgramas;

public class ManejaArticulo {

	public static void main(String[] args) {
		articuloComestible articulo1;
		articulo1=new articuloComestible(1,"leche","nose","cajero",12,3,12,2005,
			"lacteo");
		System.out.println("ID: "+articulo1.getID());
		System.out.println("nombre: "+articulo1.getNombre()+" "+articulo1.getFechaCaducidad(3));
		System.out.println("formato: "+articulo1.getFormato());
		System.out.println("vendedor: "+articulo1.getVendedor());
		System.out.println("precio: "+articulo1.getPrecio());
		System.out.println("precio con Iva: "+articulo1.getPrecioIva());
		}

	}
 