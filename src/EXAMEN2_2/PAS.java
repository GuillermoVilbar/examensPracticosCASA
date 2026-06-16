package EXAMEN2_2;

public abstract class PAS extends Personas{
	private String zonaTrabajo;



	public PAS(int dNI, String nombre, String zonaTrabajo) {
		super(dNI, nombre);
		this.zonaTrabajo = zonaTrabajo;
	}
	public String getZonaTrabajo() {
		return zonaTrabajo;
	}





	@Override
	public void presentarse() {
		// TODO Auto-generated method stub





	}

}
