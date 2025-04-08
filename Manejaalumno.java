package MisProgramas;

public class Manejaalumno {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alumno alumno1;
		alumno1=new alumno("Antonio","lopez","polo");
		System.out.println("nombre del alumno: "+alumno1.getNombre());
		System.out.println("primer apellido: "+alumno1.getApellido1());
		System.out.println("segundo apellido: "+alumno1.getApellido2());
	}

}
