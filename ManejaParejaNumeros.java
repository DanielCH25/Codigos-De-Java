package MisProgramas;

public class ManejaParejaNumeros {

	public static void main(String[] args) {
		ParejaNumeros miPareja;
		miPareja=new ParejaNumeros(3,2);
		System.out.println("Cordenada x: "+miPareja.x);
		System.out.println("Cordenada y: "+miPareja.y);
		System.out.println("Modulo: "+miPareja.devuelveModulo());
		System.out.println("Fase: "+miPareja.devuelveAngulo());
		System.out.println("Fase grados: "+miPareja.devuelveAnguloGrados());
	}

}
