package tema3_Metodos;

public class Procedimientos_sencillos {

	
	
	
	public static void metodoSimple() {
		System.out.println("mensajes de prueba");
		System.out.println("probando 1...2...3");
	}
	public static void saludarPersona(String nombre, int edad) {
		System.out.println("Hola "+ nombre + "!");
		if(edad >= 18) {
			System.out.println("Tienes "+ edad+ " años, eres mayor de edad");
		}else {
			System.out.println("Tienes "+ edad+ " años, eres menor de edad");

		}
	}

	
	public static void main(String[] args) {
		String nombre = "guillermo";
		int edad = 15;
		System.out.println("--- Ejecutando el nucleo del programa ---");

		metodoSimple();
		saludarPersona(nombre, edad);
		
	}

}
