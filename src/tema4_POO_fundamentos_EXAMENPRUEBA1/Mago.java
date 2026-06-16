package tema4_POO_fundamentos_EXAMENPRUEBA1;

public class Mago extends Personaje{
	private int mana;
	
	
	
public Mago(String nombre, int nivel, int mana) {
		super(nombre, nivel);
		this.mana=mana;
	}



public int getMana() {
	return mana;
}



@Override
public void atacar() {
	mana=mana-20;
	System.out.println(this.getNombre() + " lanza un hechizo de fuego consumiendo mana. Le queda " + mana + " de mana");
}


	
}
