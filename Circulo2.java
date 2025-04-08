package MisProgramas;

public class Circulo2 {
	//Attributes
	double x; 
	double y; //cordenadas del centro
	double radio;
	//Constructor             
	/**
	 * @param x
	 * @param y
	 * @param radio
	 */
	public Circulo2(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}	

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double devuelveSuperficie(){
		double superficie=(Math.PI*radio*radio);
		return(superficie);	
	}
	public double devuelveLongitud(){
		double longitud=(Math.PI*2*radio);
		return(longitud);
	}
}

