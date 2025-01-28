package Ejercicio1;

public class StringedInstrument extends Instrument{

	public StringedInstrument(String name, float price) {
		super(name, price);
		
	}

	@Override
	public void play() {
		System.out.println("Está sonando un instrumento de cuerda");
		
	}

}
