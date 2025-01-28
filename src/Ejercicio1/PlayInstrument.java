package Ejercicio1;

public class PlayInstrument {

	public static void main(String[] args) {

		WindInstrument trompeta = new WindInstrument("Trompeta", 150);
		trompeta.play();
		
		StringedInstrument guitarra = new StringedInstrument("Guitarra",120);
		guitarra.play();
		
		PercussionInstrument bateria = new PercussionInstrument("Bateria",500);
		bateria.play();	

	}

}
