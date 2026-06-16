package EXAMEN2_2;

public class Administrativo  extends PAS{
	private String puesto;



	public Administrativo(int dNI, String nombre, String zonaTrabajo, String puesto) {
		super(dNI, nombre, zonaTrabajo);
		this.puesto=puesto;
	}



	public String getPuesto() {
		return puesto;
	}


	@Override
	public void presentarse() {
		System.out.println("Hola soy " + this.getNombre() +
				"personal administrativo en el area " + this.getZonaTrabajo()
				+ " de "+ this.getPuesto() + " con dni " + this.getDNI()
				);
	}


}
