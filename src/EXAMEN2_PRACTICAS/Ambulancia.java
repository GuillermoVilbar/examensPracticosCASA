package EXAMEN2_PRACTICAS;

public class Ambulancia {

	private String matricula;
	private int capacidadMaxima;
	private Pacientes[]misPacientes;
	private int cantActual;
	public Ambulancia(String matricula, int capacidadMaxima) {
		super();
		this.matricula = matricula;
		this.capacidadMaxima = capacidadMaxima;
		this.misPacientes=new Pacientes[capacidadMaxima];
		this.cantActual=0;
	}

	public String getMatricula() {
		return matricula;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public Pacientes[] getMisPacientes() {
		return misPacientes;
	}
	public boolean añadirPaciente(Pacientes nuevoPaciente) {
		if (this.cantActual < this.getCapacidadMaxima()){
			this.misPacientes[this.cantActual] = nuevoPaciente;
			this.cantActual++;
			System.out.println("Paciente agregado correctamente");
			return true;
		}
		System.out.println("La ambulancia " + this.getMatricula() + " esta llena, lo sentimos");
		return false;
	}



}







	
	
	
	
	
	

