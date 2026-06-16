package tema3_jabaBasico;

public class ClasificadorNumeros {

	public static void main(String[] args) {
	int numero = 10;
	
	if (numero > 0) {
		if (numero % 2==0) {
			System.out.println("El numero es positivo y par");
		}else {
			System.out.println("El numero es positivo e impar");
		}
		
	}else if (numero < 0) {
		if (numero % 2==0) {
			System.out.println("El numero es negativo y par");
		}else {
			System.out.println("El numero es negativo e impar");
		}
		
	}else {
		System.out.println("EL NUMERO ES 0");
	}
	}

}
