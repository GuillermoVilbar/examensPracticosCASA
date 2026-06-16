package tema3_Metodos;

public class UnificadorPalabras {

	public static String juntarPalabras(String[] lista) {
		StringBuilder juntadorPalabras = new StringBuilder();
		for(int i = 0; i<lista.length;i++) {
			juntadorPalabras.append(lista[i]);

		}
		return juntadorPalabras.toString();
	}
	
	
	
	public static void main(String[] args) {
	
		String[] misPalabras = { "Me", " encanta " , "programar ", "en " , "java"};

		String solucion = juntarPalabras(misPalabras );
		System.out.println(solucion);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
