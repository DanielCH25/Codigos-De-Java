package MisProgramas;

public class alumno {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String fecha;
	private double nota;
	
	public alumno(String nombre, String apellido1, String apellido2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	//polimorfismo
	public String getNombreApellidos() {
		String NombreApellidos= nombre+" "+apellido1+" "+apellido2;
	    return(NombreApellidos);
	   }
	public String getNombreApellidos(char modo) {
	    String NombreApellidos=apellido1+" "+apellido2+","+nombre;
	    return(NombreApellidos);
	   }
	//método sobrecargado	
}
