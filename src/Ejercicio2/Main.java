package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		//1- Demostrar la Diferencia entre static final, static y final
			
			System.out.println("Marca: " + Coche.getMarca());
			Coche.Modelo("Sedan");
			System.out.println("Modelo: " + Coche.getModelo());
				
			Coche deportivo = new Coche("1600cc");
			Coche suburban = new Coche("2000cc");
			
			System.out.println("Coche Deportivo " + "Potencia: " +  deportivo.getPotencia());
			System.out.println("Coche suburban " + "Potencia: " + suburban.getPotencia());
			    			    
			System.out.println(" \n Metodo static frenar");
			System.out.println(Coche.frenar());;
			    
			System.out.println("\n Metodo no static acelerar");
			System.out.println(deportivo.acelerar());;

	}

}
