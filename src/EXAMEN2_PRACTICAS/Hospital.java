package EXAMEN2_PRACTICAS;
import java.util.Arrays;
public class Hospital {
	private String nombre;
	private Ambulancia[] misAmbulancias;
	private Sanitario[] misSanitarios;
	private int cantAmbulancias;
	private int cantSanitarios;

	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
		this.misAmbulancias = new Ambulancia[10];
		this.misSanitarios = new Sanitario[50];
		this.cantAmbulancias=0;
	}

	public String getNombre() {
		return nombre;
	}

	public Ambulancia[] getMisAmbulancias() {
		return misAmbulancias;
	}

	public Sanitario[] getMisSanitarios() {
		return misSanitarios;
	}

	public void estadisticaPersonal() {
		
		int cantMedicos =0;
		int cantEnfermeros =0;

		for(Sanitario s : misSanitarios) {
			if (s != null) {
			if(s instanceof Enfermeros) {
				cantEnfermeros++;
				
			}
			else if (s instanceof Medicos) {
				cantMedicos ++;
			}
			s.mostrarFicha();
		}
		}
		
		System.out.println("Estadistica de Personal");
		System.out.println("Medicos: "+ cantMedicos);
		System.out.println("Enfermeros:" + cantEnfermeros);
		System.out.println("cantidad total de personal: " + (cantMedicos+cantEnfermeros));
	}

	public void alertaPacienteCritico() {
		int nivelGrado =0;
		String nombre ="";
		String matricula = "";
		for(Ambulancia a : misAmbulancias) {
			for (Pacientes p : a.getMisPacientes() ) { 
				if(nivelGrado < p.getNivelGravedad()) {
					nivelGrado = p.getNivelGravedad()  ;
					nombre=p.getNombre() ;


				}
			}
			matricula = a.getMatricula();
		}
System.out.println("El Paciente mas critico es "+ nombre +
					" con un grado nivel " + nivelGrado +
					 " y ya viene en la ambulancia con matricula" + matricula);

	}
	public void filtroEdad(int edadLimite) {
		String nombre ="";
		String matricula ="";
		for(Ambulancia a : misAmbulancias) {
			for (Pacientes p : a.getMisPacientes()) {
				if(p.getEdad() == edadLimite) {
					nombre = p.getNombre();
					matricula = a.getMatricula();
					System.out.println("EN LA AMBULANCIA " + a.getMatricula());
					System.out.println("Se entraron los siguientes pacientes con la edad filtrada" 
					+ nombre +"edad: "+ edadLimite);
				}
				System.out.println("No se encontraron pacientes con ese filtro de edad");

			}
			
		}
	}
	
	public void añadirAmbulancia(Ambulancia nuevaAmbulancia) {
		if(cantAmbulancias < misAmbulancias.length ) {
			misAmbulancias[cantAmbulancias] = nuevaAmbulancia;
			cantAmbulancias++;
			System.out.println("Ambulancia agregada al hospital con exito");
		}else {
		System.out.println("Error: el hospital no admite mas ambulancias");
	}
	}
	public void añadirSanitario(Sanitario nuevoSanitario) {
		if(cantSanitarios < misSanitarios.length ) {
			misSanitarios[cantSanitarios] = nuevoSanitario;
			cantSanitarios++;
			System.out.println("Sanitario agregado al hospital con exito");
		}else {
		System.out.println("Error: el hospital no admite mas sanitarios");
	}
	}
}


