package EXAMEN2_2;

public class Alumnos extends Personas{
	private double notaMedia;

	public Alumnos(int dNI, String nombre,double notaMedia) {
		super(dNI, nombre);
		this.notaMedia=notaMedia;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	@Override
	public String toString() {
		return "Alumnos "+ getNombre() + "[nota=" + notaMedia + "]";
	}

	@Override
	public void presentarse() {
		System.out.println("Hola soy "+ this.getNombre()+
				", con DNI " + this.getDNI()+
				" y mi nota media es un " + this.getNotaMedia());


	}




}
