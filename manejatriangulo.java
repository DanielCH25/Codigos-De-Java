package MisProgramas;

public class manejatriangulo {

	public static void main(String[] args) {
		triangulo mitriangulo;
		mitriangulo=new triangulo(1,-2,2,3,2,-2);
		System.out.println("Area: "+mitriangulo.devuelveArea());
		System.out.println("Perimetro: "+mitriangulo.devuelvePerimetro());

	}

}
