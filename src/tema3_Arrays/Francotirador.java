package tema3_Arrays;
import java.util.Arrays;

public class Francotirador {

	public static void main(String[] args) {
		
		int[] numeros = {5, 1, 4, 2, 8};
				
				System.out.println("Antes: " + Arrays.toString(numeros));
				System.out.println("----------------------------------");

				// 1. El bucle exterior recorre los "asientos" que queremos rellenar (de izquierda a derecha)
				for (int i = 0; i < numeros.length - 1; i++) {
					
					// De momento, suponemos que el número más pequeño está en la posición actual 'i'
					int indiceMinimo = i; 
					
					// 2. El bucle interior busca el verdadero mínimo en el resto del array (desde i + 1 hasta el final)
					for (int j = i + 1; j < numeros.length; j++) {
						
						// Si encontramos un número más pequeño que nuestro mínimo actual...
						if (numeros[j] < numeros[indiceMinimo]) {
							indiceMinimo = j; // ... guardamos su posición
						}
					}
					
					// 3. Al terminar de buscar, intercambiamos el número del asiento 'i' con el mínimo encontrado
					// (Solo si el mínimo no era ya el propio 'i')
					if (indiceMinimo != i) {
						int aux = numeros[i];
						numeros[i] = numeros[indiceMinimo];
						numeros[indiceMinimo] = aux;
					}
				}
				
				System.out.println("Después: " + Arrays.toString(numeros));
			}
		

	

}
