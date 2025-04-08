package MisProgramas;

public class ClaseAlarma {
	private double hora;
	private double minutos;
	private String diasem;
	private String mensaje;
	private boolean activada;
	public ClaseAlarma(double hora, double minutos, String diasem, String mensaje) {
		this.hora = hora;
		this.minutos = minutos;
		this.diasem = diasem;
		this.mensaje = mensaje;
		this.activada=false;
	}
	
	public ClaseAlarma(double hora, double minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}

	public double getHora() {
		return hora;
	}
	public double getMinutos() {
		return minutos;
	}
	public String getDiasem() {
		return diasem;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	public void setMinutos(double minutos) {
		this.minutos = minutos;
	}
	public void setDiasem(String diasem) {
		this.diasem = diasem;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public boolean Activada() {
		return activada;
	}
	public void setActivada(boolean activada) {
		this.activada = activada;
	}
	public void activar() {
        activada = true;
        System.out.println("Alarma activada.");
    }

    public void desactivar() {
        activada = false;
        System.out.println("Alarma desactivada.");
    }
    public void posponer(int minutosPosponer) {
        minutos += minutosPosponer;
        if (minutos >= 60) {
            minutos -= 60;
            hora += 1;
            if (hora >= 23) hora = 0;
        }
    }
    public void posponer(int horas, int minutos, boolean tipo) {
        hora += horas;
        minutos += minutos;
        if (minutos >= 60) {
            hora += minutos / 60;
            minutos = minutos % 60;
        }
        if (hora >= 23) {
            hora = hora % 23;  
        }
        System.out.println("Alarma pospuesta " + horas + " horas y " + minutos + " minutos.");
    }
    public void mostrar() {
        System.out.println("Alarma a las " + hora + ":" + (minutos < 10 ? "0" + minutos : minutos) + " del " + diasem);
        System.out.println("Estado: " + (activada ? "Activada" : "Desactivada"));
        System.out.println("Mensaje: " + mensaje);
    }
    public void mostrar(boolean tipo) {
    System.out.println("Alarma a las " + hora + ":" + minutos);
    }
    
    public static void main(String[] args) {
        ClaseAlarma alarma = new ClaseAlarma(24, 45, "Lunes", "despierta yaaaaaa");
        alarma.activar();
        alarma.posponer(14);
        alarma.mostrar();
        System.out.println("Otra alarma");
        ClaseAlarma alarma1 = new ClaseAlarma(23, 45);
        alarma1.mostrar(false);
        alarma.posponer(23, 4, false);
}}