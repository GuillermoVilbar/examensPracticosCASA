package tema3_Strings;

public class SistemaAuditoriaVuelos {

	public static void main(String[] args) {
		
		String reportePasajero = """
		        PASAJERO:7742-Carlos
		        MALETAS: 2.0 
		        """;
		// Validacion de billete
		String[] textoSeparado = reportePasajero.split("\n");
		String[] numeroPasajero =textoSeparado[0].replace("PASAJERO:","").split("-");
		char primerCaracter = numeroPasajero[0].charAt(0);
		boolean primerNumero = Character.isDigit(primerCaracter);
		
		// 
		String[] lineasLimpia = textoSeparado[1].split(":");
		String lineasSespacio = lineasLimpia[0].trim();
		
		// convertimos el numero de maletas en numeros reales
		
		double numeroReal = Double.parseDouble(lineasLimpia[1]);
		int numeroBillete = Integer.parseInt(numeroPasajero[0]);
				if (primerNumero) {
					System.out.println("PASAJERO VALIDADO. PESO TOTAL DE EQUIPAJE REGISTRADO " + numeroReal + "kg");
				}else {
					System.out.println("ERROR ERROR ERROR");
				}
	
		
		
		
		
		
		
	}

}
