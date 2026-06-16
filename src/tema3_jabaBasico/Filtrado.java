package tema3_jabaBasico;

public class Filtrado {

	public static void main(String[] args) {
		        
		        // 1. Iniciamos un bucle for que va desde 1 hasta 20 de uno en uno
		        for (int i = 1; i <= 20; i++) {
		            
		            // Regla de filtrado 2: Si el número llega a ser exactamente 17, detenemos todo
		            if (i == 17) {
		                System.out.println("Alerta: Se ha alcanzado el ID crítico 17. Deteniendo bucle...");
		                break; // Rompe el bucle por completo y sale de él inmediatamente
		            }
		            
		            // Regla de filtrado 1: Si el número es múltiplo de 3, lo ignoramos
		            if (i % 3 == 0) {
		                // Usamos continue para saltar lo que queda de vuelta e ir a la siguiente
		                continue; 
		            }
		            
		            // 2. Si el número no rompió el bucle ni fue saltado, se procesa aquí
		            System.out.println("Procesando ID: " + i);
		        }
		        
		        System.out.println("El programa ha terminado de revisar la secuencia.");
		    }



	

}
