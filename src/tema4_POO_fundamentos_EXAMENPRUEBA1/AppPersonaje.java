package tema4_POO_fundamentos_EXAMENPRUEBA1;

import java.util.ArrayList;

public class AppPersonaje {

	public static void main(String[] args) {

		ArrayList<Personaje> misPersonajes= new ArrayList<>();

		misPersonajes.add(new Arquero("carlitos", 24, 40));
		misPersonajes.add(new Mago("guillermo ", 50, 500));
		misPersonajes.add(new Mago("jose", 20,250));
		for(Personaje p : misPersonajes) {
			p.atacar();
			if (p instanceof Arquero a) {
				a.dispararFlecha();;
			}
		}


	}

}
