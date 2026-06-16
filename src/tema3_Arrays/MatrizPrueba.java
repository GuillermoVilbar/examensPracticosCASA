package tema3_Arrays;

public class MatrizPrueba {

	public static void main(String[] args) {
		int[][] tablero = new int [2][3];
		
				tablero[0][0] = 15;
				tablero[1][0] =20;
				
		for(int i=0; i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				System.out.print(tablero[i][j]+ " " );
			}
			System.out.println();
		}

	}

}
