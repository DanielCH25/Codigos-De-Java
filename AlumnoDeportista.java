package MisProgramas;

public class AlumnoDeportista extends alumno{
	private String deport;
	public AlumnoDeportista(String nombre, String apellido1, String apellido2,String deporte) {
	     super(nombre, apellido1, apellido2);
	     this.deport=deporte;
}

}