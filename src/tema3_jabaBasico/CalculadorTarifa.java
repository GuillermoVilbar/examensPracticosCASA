package tema3_jabaBasico;

public class CalculadorTarifa {

	public static void main(String[] args) {
		
		double peso = 5.5;
		char zona = 'B';
		double tarifaBase=0.0;
		
		switch (zona) {
		case 'A':
			tarifaBase = 20.00;
			break;
		case 'B':
			tarifaBase = 30.00;
			break;
		case 'C':
			tarifaBase = 40.00;
			break;
			
			default: 
				System.out.println("ZONA NO VALIDA");
				tarifaBase = 0.0;
				break;
		}

		if (tarifaBase > 0.0) {
			double costeFinal = peso * tarifaBase;
			System.out.println("Resumen del envio");
			System.out.println("peso del paquete "+ peso + "kg");
			System.out.println(" zona del paquete" + zona );
			System.out.println(" el coste final del envio es: "+ costeFinal + "€");
		}else {
			System.out.println("no se pudo caclular el coste debido a un error den los datos");
		}
	}

}
