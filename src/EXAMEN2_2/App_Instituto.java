package EXAMEN2_2;

public class App_Instituto {

	public static void main(String[] args) {

		InstitutoGalileo instituto1 = new InstitutoGalileo("Galileo");

		Alumnos alumno1 = new Alumnos(457627,"guillermo",8.75 );
		Alumnos alumno2 = new Alumnos(457628,"carlos",4.75 );
		Alumnos alumno3 = new Alumnos(457629,"jose",6.25 );
		Alumnos alumno4 = new Alumnos(457630,"josefa",6.45 );

		Personas profe1 = new Profesores(457631, "juan", "matematica");
		profe1.presentarse();
		Personas administrativo1 = new Administrativo(457632, "jonatan","oficina","encargado");
		administrativo1.presentarse();
		Personas limpieza1 = new PersonalLimpieza(457633, "maria","gimnasio", "mañana" );
		limpieza1.presentarse();
		instituto1.añadirPersonal(limpieza1);
		instituto1.añadirPersonal(administrativo1);
		instituto1.añadirPersonal(profe1);
		Aula aulaPequeña = new Aula("informatica",2);
		Aula aulaGrande = new Aula("arte",5);
		instituto1.añadirAula(aulaPequeña);

		aulaPequeña.añadirAlumno(alumno3);
		aulaPequeña.añadirAlumno(alumno2);
		aulaPequeña.añadirAlumno(alumno1);
		aulaPequeña.añadirAlumno(alumno4);

		instituto1.estadisticaPersonal();
		instituto1.filtroNotas(5.00);
		instituto1.mejorNotaAlumnoAula();

		System.out.println(instituto1.getMisAulas());














	}

}
