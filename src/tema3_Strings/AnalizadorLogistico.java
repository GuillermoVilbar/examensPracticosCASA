package tema3_Strings;

public class AnalizadorLogistico {

	public static void main(String[] args) {
		        // 1. LA TRAMPA DE LA MEMORIA
		        // codigo1 se crea como un "literal". Va directo al String Pool.
		        String codigo1 = "PROD-9845-ES";
		        
		        // codigo2 se crea con 'new'. Java le obliga a crear un objeto nuevo en el Heap.
		        String codigo2 = new String("PROD-9845-ES");

		        System.out.println("--- COMPROBACIÓN DE MEMORIA (==) ---");
		        // O operador == compara las DIRECCIONES DE MEMORIA (dónde están guardados)
		        if (codigo1 == codigo2) {
		            System.out.println("Son iguales con == (Están en la misma dirección)");
		        } else {
		            System.out.println("Son distintos con == (Están en direcciones diferentes)");
		        }

		        System.out.println("\n--- COMPROBACIÓN DE CONTENIDO (.equals) ---");
		        // El método .equals() compara el TEXTO real letra por letra
		        if (codigo1.equals(codigo2)) {
		            System.out.println("Son iguales con .equals() (Tienen el mismo texto)");
		        } else {
		            System.out.println("Son distintos con .equals()");
		        }

		        System.out.println("\n--- VALIDACIÓN DEL CÓDIGO ---");
		        // 2. MÉTODOS DE VERIFICACIÓN (De tu documento)
		        // .startsWith() comprueba si empieza por ese texto
		        boolean empezaBen = codigo1.startsWith("PROD-");
		        
		        // .endsWith() comprueba si termina por ese texto
		        boolean remataBen = codigo1.endsWith("-ES");
		        
		        // .charAt(índice) extrae la letra o número de esa posición exacta (recuerda contar desde el 0)
		        // P   R   O   D   -   9   8   4   5   -   E   S
		        // 0   1   2   3   4   5   6   7   8   9  10  11
		        char numeroIdentificador = codigo1.charAt(5);

		        if (empezaBen && remataBen) {
		            System.out.println("El código estructuralmente es correcto.");
		            System.out.println("El primer dígito numérico del producto es: " + numeroIdentificador);
		        } else {
		            System.out.println("Código erróneo o no homologado.");
		        }
		    
		
		

	}

}
