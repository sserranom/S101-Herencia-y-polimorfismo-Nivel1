package Ejercicio2;


public class Coche {
//  es constante (no se puede modificar) y es compartida por todas las instancias.
	private static final String marca="BMW"; 
	
//Esta es un variable comun para todas las instancias de la clase, pertenece a la clase misma
	private static String modelo;
	
//es una constante no puede ser modificada después de ser inicializada
	private final String potencia;				
	
	
	// potencia es el unico atributo que puede inicializarse en el constructor ya que es especifico para cada instancia de la calse
	public Coche(String potencia) {

		this.potencia = potencia;  
		
	}
	
	public static void Modelo(String modelo) {
		Coche.modelo = modelo;
	}
	
	public static String showModelo() {
		return modelo;
	}
	

	public static String showMarca() {
		return marca;
	}
	
	public String showPotencia() {
		return potencia;
	}
	
	public static String frenar() {
		
		return "El vehículo está frenando";
		
	}
	
	public String acelerar() {
		
		return "El vehículo está acelerando";
	}
	

	
	
	
	
	
	

}

