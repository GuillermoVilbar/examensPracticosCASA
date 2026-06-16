package tema3_Strings;

public class ReconstructorNombres {

	public static void main(String[] args) {
	String nombreCompleto = "Luis_Alberto_Gomez_Perez";
	String[] textoSeparado = nombreCompleto.split("_");
	
	String nombreOficial = String.join("-",textoSeparado[0], textoSeparado[2]);
	
	System.out.println(nombreOficial);
	}

}
