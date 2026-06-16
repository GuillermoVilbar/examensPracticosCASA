package tema3_ArraysList;

import java.util.Scanner;
import java.util.ArrayList;
public class ControlInvitados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);



		ArrayList<String>invitados=new ArrayList<>();
		for (int i=0; i<5;i++) {
			invitados.add(entrada.nextLine());

		}
		System.out.println("Dime los nombres de los invitados que quieras buscar");
		String nombreBuscado= entrada.nextLine();
		if(invitados.contains(nombreBuscado)) {
			invitados.remove(nombreBuscado);
			System.out.println("HA ENTRADO "+ nombreBuscado);
			System.out.println("FALTAN POR ENTRAR:");
			for(String s: invitados) {
				System.out.println(s);

			}
		}else {
			System.out.println("ACCESO DENEGADO! NO ESTAS EN LA LISTA");
		}
		entrada.close();

	}

}
