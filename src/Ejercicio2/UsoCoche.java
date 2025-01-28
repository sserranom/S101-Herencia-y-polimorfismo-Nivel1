package Ejercicio2;

public class UsoCoche {

	public static void main(String[] args) {
		
		//1- Demostrar la Diferencia entre static final, static y final
				
		
				/*un atributo static final modelo es una constante de clase, no se puede cambiar y deben ser inicializadas al momento de la declaración
				Para vizualisar el atributo se hace invocando el metodo desde la misma clase*/
				System.out.println("Marca: " + Coche.showMarca());
				
				/*El atributo static String modelo: es una variable de clase y pueder ser vistos por todos las instancias,
				  aunque sea una variable de clase, se puede actualizar y utilizar por todas las instancias*/
							
				
				//Esta es la forma para acceder al atributo modelo
				Coche.Modelo("Sedan");
				System.out.println("Modelo: " + Coche.showModelo());
				
				//el atributo final potencia puede ser invocado desde la misma instancia donde se ha declarado
				Coche deportivo = new Coche("1600cc");
				Coche suburban = new Coche("2000cc");
				
				/* El atributo final String potencia es una constante que se crea en cada instancia y ya no se puede actualizar o modificar,
				solo se puede visualizar atraves de su metodo get */
				
			    System.out.println("Coche Deportivo " + "Potencia: " +  deportivo.showPotencia());
			    System.out.println("Coche suburban " + "Potencia: " + suburban.showPotencia());
			    
			    
			    System.out.println(" \n Metodo static frenar");
			    System.out.println(Coche.frenar());;
			    
			    System.out.println();
			    System.out.println("Metodo no static acelerar");
			    System.out.println(deportivo.acelerar());;

	}

}
