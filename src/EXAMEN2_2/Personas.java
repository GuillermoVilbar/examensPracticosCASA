package EXAMEN2_2;

public abstract class Personas {
	private int DNI;
	private String nombre;

	public Personas(int dNI, String nombre) {
		DNI = dNI;
		this.nombre = nombre;
	}

	public int getDNI() {
		return DNI;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Personas [DNI=" + DNI + ", nombre=" + nombre + "]";
	}

	public abstract void presentarse();



}
