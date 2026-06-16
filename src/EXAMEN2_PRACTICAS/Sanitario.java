package EXAMEN2_PRACTICAS;

public abstract class Sanitario {
private String dni;
private String nombreCompleto;

public Sanitario(String dni, String nombreCompleto) {
	this.dni = dni;
	this.nombreCompleto = nombreCompleto;
}

public String getDni() {
	return dni;
}

public String getNombreCompleto() {
	return nombreCompleto;
}
 public abstract void mostrarFicha();

 @Override
 public String toString() {
	return "Sanitario [dni=" + dni + ", nombreCompleto=" + nombreCompleto + "]";
 }


}
