package tema3_jabaBasico;

public class ConverisonCasting {

	public static void main(String[] args) {
		
		

		        // 1. Declaramos las tres variables con decimales (double)
		        double medida1 = 4.75;
		        double medida2 = 8.21;
		        double medida3 = 1.99;

		        // Variables de control y acumulación
		        int sumaTotal = 0;
		        int contador = 1;

		        // 2. Iniciamos el bucle while que dará exactamente 3 vueltas
		        while (contador <= 3) {
		            
		            // Usamos un switch para saber qué medida toca procesar en esta vuelta
		            switch (contador) {
		                case 1:
		                    // Aplicamos CASTING EXPLÍCITO (int) para truncar los decimales
		                    sumaTotal += (int) medida1; 
		                    break;
		                case 2:
		                    sumaTotal += (int) medida2;
		                    break;
		                case 3:
		                    sumaTotal += (int) medida3;
		                    break;
		            }

		            // 3. Incrementamos el contador para avanzar en el bucle
		            contador++; 
		        }

		        // 4. Mostramos el resultado final
		        System.out.println("La suma total de las partes enteras es: " + sumaTotal);
		    }
		
	
}
