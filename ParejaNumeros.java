package MisProgramas;

public class ParejaNumeros {
	//Attributes
	double x;
	double y;
	//Constructor
	public ParejaNumeros(double nuevoX, double nuevoY){
		this.x=nuevoX;//el x de mi clase toma el valor del x que recibo de fuera
		this.y=nuevoY;
		//this.x es la x interna "original"
		
	}
	//Metodos
	double getX() {
		return(x);
	}
	double getY(){
		return(y);
	}
	void setX(int x) {
		this.x=x;
	}
	void setY(int y) {
		this.y=y;
	}
	double devuelveModulo(){
		double modulo=Math.sqrt(x*x+y*y);
		return(modulo);
		
	}
	double devuelveAngulo(){
		double angulo=Math.atan(y/x);
		return(angulo);
	}
	double devuelveAnguloGrados() {
		double anguloRad=Math.atan(y/x);
		double anguloGrados=180*anguloRad/Math.PI;
		return(anguloGrados);
	}
}
