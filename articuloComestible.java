package MisProgramas;

public class articuloComestible extends Articulo {
	private fecha FechaCaducidad;
	private String tipo;
	public articuloComestible(double iD, String nombre, String formato, String vendedor, double precio,int dia, int mes, int anio, String tipo) {
		super(iD, nombre, formato, vendedor, precio);
		this.tipo=tipo;
		FechaCaducidad=new fecha(18,12,2004);
	}
	public String getFechaCaducidad(int tipoformato) {
		return FechaCaducidad.getFechaFormato(tipoformato);
	}
	public void setFechaCaducidad(int dia, int mes, int anio) {
		FechaCaducidad.setDia(dia);
		FechaCaducidad.setMes(mes);
		FechaCaducidad.setAnio(anio);
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
