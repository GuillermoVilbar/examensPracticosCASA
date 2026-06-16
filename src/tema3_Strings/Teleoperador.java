package tema3_Strings;
import java.util.Scanner;
public class Teleoperador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		int opcion;
		do{// 1. Le mostramos las opciones al usuario en la consola
		System.out.println("=== BIENVENIDO A LA CENTRALITA ===");
		System.out.println("1. Hablar con el departamento de Facturación");
		System.out.println("2. Hablar con Soporte Técnico");
		System.out.println("3. Reclamaciones");
		System.out.println("Pulsa 0 para salir");

		// 2. Esperamos a que el usuario escriba el número y lo guardamos
		opcion = entrada.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Hablando con el departamento de facturacion");
			break;
		case 2:
			System.out.println("Conectando con un telfono");
			break;
		case 3:
			System.out.println("llamando a relcamaciones");
			break;
		case 0:
			System.out.println("Adios...");
			break;
		default:
			System.out.println("error por favor introduzca un numero del 1 al 3");
			break;
		} 
		System.out.println("---------------------------------------------------------");
		}while(opcion!=0);	
			
			
			
			
			
		}
		
	}
	
	


