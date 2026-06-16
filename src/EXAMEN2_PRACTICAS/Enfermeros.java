package EXAMEN2_PRACTICAS;

public class Enfermeros extends Sanitario{
private int numeroColegiado;

public Enfermeros(String dni, String nombreCompleto, int numeroColegiado) {
	super(dni, nombreCompleto);
	this.numeroColegiado=numeroColegiado;
}

public int getNumeroColegiado() {
	return numeroColegiado;
}

@Override
public void mostrarFicha() {
	System.out.println("mi nombre es " + this.getNombreCompleto() + 
			",soy enfermero, mi DNI es "+ this.getDni() + " y mi numero de colegiado es"
			+ this.getNumeroColegiado());
}

@Override
public String toString() {
	return "Enfermeros [numeroColegiado=" + numeroColegiado + "]";
}



	
	
	
}
