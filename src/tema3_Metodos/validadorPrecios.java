package tema3_Metodos;

public class validadorPrecios {

	public static String formatearJuego(String nombre, double precio) {
		StringBuilder nombreJuego = new StringBuilder(nombre + " cuesta :" + precio );
		nombreJuego.append("€");
		String nombreJuegoFinal = nombreJuego.toString();
		return nombreJuegoFinal;
	    // Desarrolla tu código aquí
	    // Recuerda usar el 'return' para enviar la cadena resultante
	}
	
	public static void main(String[] args) {

		System.out.println(formatearJuego("finalFantasy", 450));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
