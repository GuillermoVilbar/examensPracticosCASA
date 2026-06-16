package tema3_Arrays;

import java.util.Arrays;
public class Edades {

	public static void main(String[] args) {

		int[] edades = new int [4];

		double[] precios = {15.5,51.2,23.5};

		edades[1] = 20;



		edades[0] = 18;
		edades[edades.length-1] =25;
		precios[1] = 10.5;
		System.out.println(edades[0]);
		System.out.println(precios[1]);

		Arrays.sort(precios);
		Arrays.sort(edades);
		System.out.println("Precios ordenados: "+ Arrays.toString(precios));
		System.out.println("Edades actuales "+ Arrays.toString(edades));

		for (int i = 0; i < precios.length; i++) {
		    System.out.print(precios[i] + " - ");
		}
		for(double e : edades) {
			System.out.print(" "+e);
		}
		// Salida en consola: 10.5 15.5 23.5
	}

}
