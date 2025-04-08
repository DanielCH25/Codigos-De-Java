package MisProgramas;

public class CilindroConColor extends Cilindro{
	private String color;
	public CilindroConColor(double radio, double altura, Coordenadas coordenadasCentroBase, CilindroConColor color) {
		super(radio, altura, coordenadasCentroBase);
		// TODO Auto-generated constructor stub
	}

	public CilindroConColor(double radio, double altura, String color2) {
		super(radio, altura);
		color = color2;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
