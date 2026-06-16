package tema3_ArraysList;

import java.util.ArrayList;
import java.util.Scanner;
public class ListaCompra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> compra = new ArrayList<>();
		System.out.println("--- lista de la compra interactiva ----");
		for (int i = 0; i < 3; i++) {
			System.out.print("Introduce el producto " + (i + 1) + ": ");
			compra.add(entrada.nextLine());
			
		}
		
		
		System.out.println("tu lista final de la compra es...");
		for(String c : compra) {
			System.out.println(c);
		}
		
		
		entrada.close();
		
	}

}
