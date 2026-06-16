package Cafeteria;

import java.util.Objects;

public class Cafeteria {
	private String marca;
	private int capacidadMaxima;
	private int capacidadActual;

	public Cafeteria(String marca, int capacidadMaxima, int capacidadActual) {
		this.marca=marca;
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual=capacidadActual;
	}
	
	

	public String getMarca() {
		return marca;
	}



	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}



	public int getCapacidadActual() {
		return capacidadActual;
	}



	public void mostrarEstado() {
		System.out.println(marca + " le queda:" + capacidadActual +"de los" + capacidadMaxima);
	}
	public void hacerCafe(int mililitros) {
		capacidadActual=(capacidadActual-mililitros);
		System.out.println("Sirviendo una taza de "+ mililitros + "ml");

	}



	@Override
	public int hashCode() {
		return Objects.hash(capacidadMaxima, marca);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cafeteria))
			return false;
		Cafeteria other = (Cafeteria) obj;
		return capacidadMaxima == other.capacidadMaxima && Objects.equals(marca, other.marca);
	}
	
	



}
