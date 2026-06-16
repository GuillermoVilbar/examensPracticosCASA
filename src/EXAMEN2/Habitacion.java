package EXAMEN2;

public class Habitacion {

	private double superficie;
	private int ventanas;
	private String uso;
	
	public Habitacion(double superficie, int ventanas, String uso) {
		this.superficie = superficie;
		this.ventanas = ventanas;
		this.uso = uso;
	}

	public double getSuperficie() {
		return superficie;
	}

	public int getVentanas() {
		return ventanas;
	}

	public String getUso() {
		return uso;
	}

	@Override
	public String toString() {
		return "Habitacion [superficie=" + superficie + ", ventanas=" + ventanas + ", uso=" + uso + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
