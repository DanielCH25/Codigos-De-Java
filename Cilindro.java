package MisProgramas;

public class Cilindro{
	private double radio;
	private double altura;
	private Coordenadas coordenadasCentroBase;
	
	
  
    public Cilindro(double radio, double altura, Coordenadas coordenadasCentroBase) {
		this.radio = radio;
		this.altura = altura;
		this.coordenadasCentroBase = coordenadasCentroBase;
		
	}
    
    public Cilindro(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}
    //sobre cargar el codigo, es como hacer otro construcutor 
    //pero con menos parametros

	public double getRadio() {
		return radio;
	}

	public double getAltura() {
		return altura;
	}

	public Coordenadas getCoordenadasCentroBase() {
		return coordenadasCentroBase;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCoordenadasCentroBase(Coordenadas coordenadasCentroBase) {
		this.coordenadasCentroBase = coordenadasCentroBase;
	}
	

	public double devuelveArea() {
    	double Area=Math.PI*radio*radio;
    	return(Area);
    }
	public double devuelveSuperficie() {
		double areaLateral=2*Math.PI*radio*altura;
		double Area=Math.PI*radio*radio;
		double superficie=areaLateral+Area*2;
		return(superficie);
		}
	public double devuelveSuperficie(boolean tipo){
		double areaLateral=2*Math.PI*radio*altura;
		return areaLateral;

		
	}
	
	public static void main(String[] args) {
    	Cilindro Cilindro1;
    	CilindroConColor Cilindro2;
    	Cilindro2=new CilindroConColor(2,4,"rojo");
    	Coordenadas misCoordenadas;
    	misCoordenadas=new Coordenadas(5,2,1);
    	Cilindro1=new Cilindro(3,5,misCoordenadas);
		System.out.println("Area: "+Cilindro1.devuelveArea());
		System.out.println("SuperficieLat: "+Cilindro1.devuelveSuperficie(false));
		System.out.println("COLOR: "+Cilindro2.getColor());
	}

	
		
		
}