package tema3_Arrays;

public class Personalizado {

	public static void main(String[] args) {
		int [][]ventas =new int[3][4];
		
		// --- FILA 0 (Producto 1) ---
		ventas[0][0] = 10; // Semana 1
		ventas[0][1] = 15; // Semana 2
		ventas[0][2] = 20; // Semana 3
		ventas[0][3] = 5;  // Semana 4

		// --- FILA 1 (Producto 2) ---
		ventas[1][0] = 8;
		ventas[1][1] = 12;
		ventas[1][2] = 4;
		ventas[1][3] = 10;

		// --- FILA 2 (Producto 3) ---
		ventas[2][0] = 25;
		ventas[2][1] = 30;
		ventas[2][2] = 15;
		ventas[2][3] = 20;

		// 1. El bucle de fuera se para en cada fila (Producto)
		for (int i = 0; i < ventas.length; i++) {
		    
		    // ¡AQUÍ ESTÁ EL TRUCO! La suma se pone a 0 cada vez que cambiamos de fila
		    int sumaProducto = 0; 
		    
		    // 2. El bucle de dentro recorre las 4 semanas de esa fila concreta
		    for (int j = 0; j < ventas[i].length; j++) {
		        // Vamos acumulando el valor de la casilla actual
		        sumaProducto += ventas[i][j]; 
		    }
		    
		    // 3. Al terminar de recorrer las columnas de esta fila, mostramos el total
		    System.out.println("El total de ventas del Producto " + (i + 1) + " es: " + sumaProducto);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
