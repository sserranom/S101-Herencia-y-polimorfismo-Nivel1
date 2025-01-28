package Ejercicio1;

public abstract class Instrument {
	protected String name;
	protected float price;
	
	public Instrument(String name, float price) {
		this.name = name;
		this.price = price;
	}
	
	 static {
		   System.out.println("Se ha cargado la Clase Instrumentos");
	   }

	public abstract void play();
		

}

