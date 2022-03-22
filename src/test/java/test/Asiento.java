package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color){
		if (this.color == "rojo" || this.color == "verde" || this.color == "amarillo" || this.color == "negro" || this.color == "blanco"){
			this.color = color;
		}
	}
}