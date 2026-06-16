package tema3_ArraysList;

import java.util.ArrayList;
import java.util.Scanner;
public class FiltroNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		ArrayList<Double>notas = new ArrayList<>();
		for(int i=0; i< 4; i++) {
			System.out.println("introduce las notas del alumno:"+ (i+1) );
			notas.add(entrada.nextDouble());
		}
		System.out.println("LISTA DE NOTAS APROPBADAS");
			for (double d : notas) {
				if (d>= 5.00) {
				System.out.println(d);
			}
			}
		entrada.close();
		
			
	}
		
		}
	


