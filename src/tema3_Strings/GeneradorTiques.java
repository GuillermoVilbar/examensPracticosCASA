package tema3_Strings;

public class GeneradorTiques {


		    public static void generarLinea(String producto, int cantidad, double precioUnitario) {
		        // 1. Calcula el precio total de esta línea (cantidad * precioUnitario)
		        double totalLinea = cantidad * precioUnitario;
		        
		        // 2. Usa System.out.printf para mostrarlo todo ordenado.
		        // Recuerda usar %s para el nombre, %d para la cantidad, %.2f para los precios y %n para el salto de línea.
		        System.out.printf("%s x%d | Uds: %.2f€ | Total: %.2f€%n", producto, cantidad, precioUnitario, totalLinea);
		    }

		    public static void main(String[] args) {
		        System.out.println("===============================");
		        generarLinea("Café Espresso", 2, 1.456);
		        generarLinea("Croissant", 1, 1.95);
		        generarLinea("Zumo Naranja N.", 3, 2.75);
		        System.out.println("===============================");
		        
		        // Salida esperada en consola:
		        // ===============================
		        // Café Espresso x2 | Uds: 1,46€ | Total: 2,91€
		        // Croissant x1 | Uds: 1,95€ | Total: 1,95€
		        // Zumo Naranja N. x3 | Uds: 2,75€ | Total: 8,25€
		        // ===============================
		    
		

	}

}
