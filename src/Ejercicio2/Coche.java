package Ejercicio2;


public class Coche {

	private static final String MARCA="BMW"; 
	private static String modelo;
	private final String POTENCIA;				
	
	public Coche(String POTENCIA) {

		this.POTENCIA = POTENCIA;  
		
	}
	
	public static void Modelo(String modelo) {
		Coche.modelo = modelo;
	}
	
	public static String getModelo() {
		return modelo;
	}
	

	public static String getMarca() {
		return MARCA;
	}
	
	public String getPotencia() {
		return POTENCIA;
	}
	
	public static String frenar() {
		return "El vehículo está frenando";	
	}
	
	public String acelerar() {
		return "El vehículo está acelerando";
	}
	

	
	
	
	
	
	

}

