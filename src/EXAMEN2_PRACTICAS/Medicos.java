package EXAMEN2_PRACTICAS;

public class Medicos extends Sanitario{
private String especialidad;

public Medicos(String dni, String nombreCompleto, String especialidad) {
	super(dni, nombreCompleto);
this.especialidad=especialidad;
}

public String getEspecialidad() {
	return especialidad;
}

@Override
public void mostrarFicha() {
	System.out.println("mi nombre es " + this.getNombreCompleto() + 
						",soy medico,  mi DNI es "+ this.getDni() + " y me especializo en "+
						 this.getEspecialidad());
	
}

@Override
public String toString() {
	return "Medicos [especialidad=" + especialidad + "]";
}


	
	
	
	
	
}
