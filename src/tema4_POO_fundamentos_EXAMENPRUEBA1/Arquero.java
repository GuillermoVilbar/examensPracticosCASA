package tema4_POO_fundamentos_EXAMENPRUEBA1;

public class Arquero extends Personaje{

	private int flechas;
	
	public Arquero(String nombre, int nivel, int flechas) {
		super(nombre, nivel);
		this.flechas=flechas;
	}
public void dispararFlecha() {
	flechas = flechas-1;
	System.out.println(this.getNombre() + " ha disparado una flecha. Le quedan  " + flechas + "flechas");
}
@Override
public String toString() {
	return "Arquero "+ this.getNombre() + "nivel" + this.getNivel()+ "flechas " + flechas;
}
 
}
	
	
	
	

