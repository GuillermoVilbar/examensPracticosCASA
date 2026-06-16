package EXAMEN2_2;

public class Profesores extends Personas{
	private String especialidad;

	public Profesores(int dNI, String nombre, String especialidad) {
		super(dNI, nombre);
		this.especialidad=especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	@Override
	public void presentarse() {
		System.out.println("Hola soy el profesor " + this.getNombre() +
				" con DNI " + this.getDNI() +
				" y soy de "+ this.getEspecialidad());

	}



}
