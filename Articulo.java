package MisProgramas;

public class Articulo {
	private double ID;
	private String nombre;
	private String formato;	
	private String vendedor;
	private double precio;
	
	public Articulo(double iD, String nombre, String formato, String vendedor, double precio) {
		ID = iD;
		this.nombre = nombre;
		this.formato = formato;
		this.vendedor = vendedor;
		this.precio = precio;
	}
	public double getID() {
		return ID;
	}
	public void setID(double iD) {
		ID = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	} 
	double getPrecioIva() {
		double precioIva=precio+0.21*precio;
		return precioIva;
	}
}
