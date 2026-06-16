package tema3_Metodos;

public class DetectorPalindromos {

	
	public static boolean esPalindromo(String palabraOriginal) {
		StringBuilder palindromo= new StringBuilder(palabraOriginal);
		palindromo.reverse();
		String palindromoHecho = palindromo.toString();
		
		return palindromoHecho.equalsIgnoreCase(palabraOriginal);
		
	}
	
	
	
	
	public static void main(String[] args) {
		String cosa = "radar";
		
		boolean resultado1=(esPalindromo(cosa));
		
		if (resultado1) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		

	}

}
