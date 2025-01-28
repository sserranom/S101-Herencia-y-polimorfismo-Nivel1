package Ejercicio1;

public class WindInstrument extends Instrument{

	public WindInstrument(String name, float price) {
		super(name, price);
		
	}

	@Override
	public void play() {
		System.out.println("Está sonando un insturmento de Viento");
		
	}
	
}
	
