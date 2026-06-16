package tema3_Strings;

public class ValidadorCorreos {

	public static void main(String[] args) {
		
		


		        // 1. Declaramos el correo original con espacios y mayúsculas/minúsculas mezcladas
		        String correoOriginal = "  ExAmPle@UniVersidad.Es  ";
		        
		        // 2. Limpieza de datos (Según los métodos de tu documento)
		        // .trim() quita los espacios de delante y detrás.
		        // .toLowerCase() convierte todo el texto a minúsculas.
		        String correoLimpio = correoOriginal.trim().toLowerCase();
		        
		        // 3. VALIDACIÓN (Comprobamos las 3 reglas del enunciado)
		        
		        // Regla A: Que contenga una '@'. Si .indexOf('@') devuelve -1, significa que NO existe.
		        boolean tieneArroba = correoLimpio.indexOf('@') != -1;
		        
		        // Regla B: Que termine en ".es" o en ".com"
		        boolean terminaCorrecto = correoLimpio.endsWith(".es") || correoLimpio.endsWith(".com");
		        
		        // Regla C: Que su longitud sea mayor a 8 caracteres
		        boolean longitudValida = correoLimpio.length() > 8;
		        
		        // 4. EVALUACIÓN FINAL
		        // Usamos el operador lógico AND (&&) porque se tienen que cumplir las TRES reglas obligatoriamente
		        if (tieneArroba && terminaCorrecto && longitudValida) {
		            System.out.println("Resultado: Correo válido.");
		            System.out.println("Texto final procesado: \"" + correoLimpio + "\"");
		        } else {
		            System.out.println("Resultado: Correo rechazado.");
		            System.out.println("Motivos posibles: No tiene @, no termina en .es/.com o es muy corto.");
		        }
		    
		
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
