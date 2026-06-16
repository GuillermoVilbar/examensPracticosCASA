package tema3_Strings;

public class SistemaRegistroAlumnos {

	public static void main(String[] args) {
		
		String reporteAlumno = """
		        ALUMNO:alberto-95
		        MEDIA: 9.75 
		        """;
		
		String[] lineas = reporteAlumno.split("\n");
		String[] linea1= lineas[0].replace("ALUMNO:", "").trim().split("-");
		String nombreMayus= linea1[0].toUpperCase();
		
		
		String linea2= lineas[1].replace("MEDIA:", "").trim();
		
		
		double nota = Double.parseDouble(linea2);
		char primerCaracter = linea1[1].charAt(0);
		boolean primerNumero = Character.isDigit(primerCaracter);
		
		if(primerNumero && nota> 5.0) {
			System.out.println("ALUMNO " + nombreMayus +" MATRICULADO. Nota media registrada: "+ nota);
		} else {
			System.out.println("ERROR EN LA MATRICULA");
		}
		
		
		
		
	}

}
