package tema3_Strings;

public class ModeradorComentarios {

	public static void main(String[] args) {
		String comentario = "¡Felicitaciones! Has gtanado un PREMIO totalmente gratis.";

		String comentarioMinuscula = comentario.toLowerCase();
		
		if (comentarioMinuscula.contains("premio")|| comentarioMinuscula.contains("gratis")) {
			System.out.println("Alerta: comentario sospechoso detectado");
			
			String comentarioCensurado = comentario.replace("a", "*")
												   .replace("e", "*")
												   .replace("i", "*")
												   .replace("o", "*")
												   .replace("u", "*")
												   .replace("A", "*")
												   .replace("E", "*")
												   .replace("I", "*")
												   .replace("O", "*")
												   .replace("U", "*");
			System.out.println("Comentario censurado: "+ comentarioCensurado);
			
												   
		}else {
			System.out.println("comentario limpio");
		}

		
	}

}
