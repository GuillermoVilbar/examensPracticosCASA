package tema3_Metodos;

public class LimpiadorVocales {

	public static String quitarVocales(String frase) {
		StringBuilder quitandoVocales = new StringBuilder ();
		for(int i=0; i<frase.length();i++) {
			char letraActual = frase.charAt(i);
			if (letraActual != 'a' && letraActual!='e'&& letraActual!= 'i'&& letraActual!='o'&& letraActual!='u'&& letraActual!='A'&& letraActual!='E'
					&& letraActual!='I'&& letraActual!='O'&& letraActual!='U') {
				quitandoVocales.append(letraActual);
			}
			
		}
		String sinVocales = quitandoVocales.toString();	
		return sinVocales;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
	String frase= "examen de java";
	
	System.out.println(quitarVocales(frase));

	}

}
