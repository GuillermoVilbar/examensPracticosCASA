package tema3_Strings;

public class ExtractorSeguridad {

	public static void main(String[] args) {
		
		String claveOriginal = "  CONF-8543-A12  ";
		String claveLimpia = claveOriginal.trim();
		int primerGuion = claveLimpia.indexOf("-");
		int ultimoGuion = claveLimpia.lastIndexOf("-");
		
		String codigoCentral = claveLimpia.substring(primerGuion +1, ultimoGuion);
		char primerCaracter = codigoCentral.charAt(0);
		char ultimoCaracter = codigoCentral.charAt(codigoCentral.length()-1);
		
		boolean primerNumero = Character.isDigit(primerCaracter);
		boolean ultimoNumero = Character.isDigit(ultimoCaracter);
		
		
		if(primerNumero && ultimoNumero){
			System.out.println("codigo central valido");
		}else{
			System.out.println("codigo central corrupto");
		}
	}
}

		
		
		
		
		
		
	


