package Cafeteria;

public class CafeteraPremium extends Cafeteria{

	private int tazasServidas;
	public CafeteraPremium(String marca, int capacidadMaxima, int capacidadActual, int tazasServidas) {
		super(marca, capacidadMaxima, capacidadActual);
		this.tazasServidas=tazasServidas;
		
	}
	public int getTazasServidas() {
		return tazasServidas;
	}
	
	public void hacerEspuma() {
		System.out.println("Generando espuma de leche cremosa");
	}

	

	
	
	@Override
	public void mostrarEstado() {
		System.out.println("lleva " + tazasServidas + " tazas servidas");
		super.mostrarEstado();
	}
	
	@Override
	public String toString() {
		return "CafeteraPremium [tazasServidas=" + tazasServidas + "]";
	}
	
	

	}
	
	

	

	


