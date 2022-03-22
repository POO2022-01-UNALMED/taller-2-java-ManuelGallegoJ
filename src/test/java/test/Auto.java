package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	
	int cantidadAsientos(){
		int cont = 0; 
		for (int i=0;i<asientos.length;i++) {
			if (asientos[i] == null){
					cont += 1;
			}
		}
		return cont;
	}
	String verificarIntegridad(){
		int cont = 0;
		if (motor.registro == this.registro) {
			for (int i = 0; i<asientos.length; i++) {	
				if (asientos[i] == null){
					if (this.registro == asientos[i].registro) {
						cont++;
					}
				}		
			}
			if (cont == this.cantidadAsientos()){
				return "Auto original";
			}
			else {
				return "Las piezas no son originales";
			}
		}
		else {
			return "Las piezas no son originales";
		}
	}
}