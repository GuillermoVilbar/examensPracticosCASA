package tema3_Arrays;
import java.util.Arrays;
public class Burbuja {

	public static void main(String[] args) {
	

				// 1. Creamos el array desordenado tal y como indica tu PDF [cite: 202]
				int[] numeros = {5, 1, 4, 2, 1};
				
				System.out.println("Antes de ordenar: " + Arrays.toString(numeros));
				System.out.println("---------------------------------------------------");

				// 2. ALGORITMO DE LA BURBUJA (Estructura de bucles anidados) [cite: 245]
				
				// El bucle exterior controla cuántas pasadas completas le damos al array [cite: 246]
				for (int i = 0; i < numeros.length - 1; i++) {
					
					// El bucle interior va comparando los números vecinos de dos en dos [cite: 196, 246]
					// Le restamos 'i' para que no vuelva a revisar las posiciones del final que ya están ordenadas [cite: 201]
					for (int j = 0; j < numeros.length - 1 - i; j++) {
						
						// Si el número de la izquierda es mayor que el de su derecha... [cite: 197, 202]
						if (numeros[j] > numeros[j + 1]) {
							
							// ... los intercambiamos de sitio usando el truco del vaso vacío (auxiliar) [cite: 197]
							int aux = numeros[j];
							numeros[j] = numeros[j + 1];
							numeros[j + 1] = aux;
						}
					}
				}
				
				// 3. Mostramos el resultado final por la consola [cite: 63]
				System.out.println("Después de ordenar: " + Arrays.toString(numeros));

			}
		

	

}
