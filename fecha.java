package MisProgramas;

public class fecha {
    private int dia;
    private int mes;
    private int anio;

    // Constructor
    public fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Métodos Getters y Setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método para formatear la fecha
    public String getFechaFormato(int tipo) {
        String fechaFormateada = "";
        
        switch(tipo) {
        case 1:
            fechaFormateada = String.format("%02d/%02d/%d", dia, mes, anio);
            break;
        case 2:
            // Formato: dd-mm-yyyy
            fechaFormateada = String.format("%02d-%02d-%d", dia, mes, anio);
            break;
        case 3:
            // Formato: yyyy/mm/dd
            fechaFormateada = String.format("%d/%02d/%02d", anio, mes, dia);
            break;
        case 4:
            // Formato: yyyy-mm-dd
            fechaFormateada = String.format("%d-%02d-%02d", anio, mes, dia);
            break;
        }

        return fechaFormateada;
    }

    public static void main(String[] args) {
        fecha fecha2 = new fecha(21, 12, 2089);
        System.out.println("Fecha en formato 1 (dd/mm/yyyy): " + fecha2.getFechaFormato(1));
        System.out.println("Fecha en formato 2 (dd-mm-yyyy): " + fecha2.getFechaFormato(2));
        System.out.println("Fecha en formato 3 (yyyy/mm/dd): " + fecha2.getFechaFormato(3));
        System.out.println("Fecha en formato 4 (yyyy-mm-dd): " + fecha2.getFechaFormato(4));
    }
}
