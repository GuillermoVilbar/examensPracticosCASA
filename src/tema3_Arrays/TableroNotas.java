package tema3_Arrays;

public class TableroNotas {

	public static void main(String[] args) {
		double[][] notas = new double[3][2];
		notas[0][0]=6.2;
		notas[1][0]=4.2;
		notas[2][0]=6.5;
		notas[0][1]=8.7;
		notas[1][1]=2.0;
		notas[2][1]=7.8;
		
		notas[1][0] += 1;
		
		for(int i=0; i<notas.length;i++) {
			for (int j=0; j<notas[i].length;j++){
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
