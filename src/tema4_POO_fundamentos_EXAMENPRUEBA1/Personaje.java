package tema4_POO_fundamentos_EXAMENPRUEBA1;

import java.util.Objects;

public class Personaje {
private String nombre;
private int nivel;

public Personaje(String nombre, int nivel) {
	this.nombre = nombre;
	this.nivel = nivel;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getNivel() {
	return nivel;
}

public void setNivel(int nivel) {
	this.nivel = nivel;
}
public void atacar() {
	System.out.println(nombre + " realiza un ataque basico");
}

@Override
public int hashCode() {
	return Objects.hash(nombre);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Personaje))
		return false;
	Personaje other = (Personaje) obj;
	return Objects.equals(nombre, other.nombre);
}


	
	
	
	
}
