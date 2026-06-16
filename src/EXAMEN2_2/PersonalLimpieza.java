package EXAMEN2_2;

public class PersonalLimpieza extends PAS{

	private String turno;


	public PersonalLimpieza(int dNI, String nombre, String zonaTrabajo, String turno) {
		super(dNI, nombre, zonaTrabajo);
		this.turno=turno;
	}

	public String getTurno() {
		return turno;
	}




	@Override
	public void presentarse() {
		System.out.println("Hola soy " + this.getNombre() +
				" personal de limpieza del turno " +
				this.getTurno()+ " trabajo en la zona del "+ this.getZonaTrabajo() + " con dni " + this.getDNI()
				);



	}




}
