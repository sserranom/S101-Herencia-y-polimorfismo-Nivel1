package Ejercicio1;

public class PercussionInstrument extends Instrument{

	public PercussionInstrument(String nombre, float precio) {
		super(nombre, precio);
		
	}

	@Override
	public void play() {
		System.out.println("Está sonando un instrumento de Percusión");
		
	}
	
}
