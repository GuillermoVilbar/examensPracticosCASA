package EXAMEN2;

import java.util.Objects;

public sealed class Inmueble permits LocalesComerciales, Casas {

	private int identificador;
	private String direccion;
	private int precio;
	private double superficie;
	
	public Inmueble(int identificador, String direccion, int precio, double superficie) {
		this.identificador = identificador;
		this.direccion = direccion;
		this.precio = precio;
		this.superficie = superficie;
	}
	

	public int getIdentificador() {
		return identificador;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getPrecio() {
		return precio;
	}

	public double getSuperficie() {
		return superficie;
	}


	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Inmueble))
			return false;
		Inmueble other = (Inmueble) obj;
		return identificador == other.identificador;
	}


	@Override
	public String toString() {
		return "Inmueble [identificador=" + identificador + ", direccion=" + direccion + ", precio=" + precio
				+ ", superficie=" + superficie + "]";
	}
	
	
}
