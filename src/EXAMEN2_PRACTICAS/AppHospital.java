package EXAMEN2_PRACTICAS;

public class AppHospital {

	public static void main(String[] args) {
		Hospital miHospital1 = new Hospital("Galileo");
		Ambulancia miAmbulancia1 = new Ambulancia("A-11",2);
		Ambulancia miAmbulancia2 = new Ambulancia("B-22",4);
		
		miHospital1.añadirAmbulancia(miAmbulancia1);
		
		Pacientes miPaciente1 = new Pacientes("guillermo", 32,6);
		Pacientes miPaciente2 = new Pacientes("jose", 38,5);
		Pacientes miPaciente3 = new Pacientes("giuliano", 12,1);
		
		miAmbulancia1.añadirPaciente(miPaciente1);
		miAmbulancia1.añadirPaciente(miPaciente2);
		miAmbulancia1.añadirPaciente(miPaciente3);
		
		Sanitario miMedico1 = new Medicos("454545a", "julian","cirujia");
		Sanitario miEnfermero1 = new Enfermeros("457627b", "jimmy", 2400018);
		 
		miHospital1.añadirSanitario(miEnfermero1);
		miHospital1.añadirSanitario(miMedico1);
		 
		miHospital1.estadisticaPersonal();
		 }
		
		

	

}
