package tema3_Arrays;

public class MultiplicarFilasColumnas {

	public static void main(String[] args) {
		int miMatriz[][] = new int[4][4];
	
		
System.out.println("Rellenando matriz automaticamente");
for(int i =0; i< miMatriz.length; i++) {
	for(int j=0; j<miMatriz[i].length;j++) {
		 miMatriz[i][j]= i*j;
	}
}
System.out.println("MATRIZ REZULTANTE");

for(int i =0; i< miMatriz.length; i++) {
	for(int j=0; j<miMatriz[i].length;j++) {
		System.out.print(miMatriz[i][j]+ " ");
	}
	System.out.println();
}


	}

}
