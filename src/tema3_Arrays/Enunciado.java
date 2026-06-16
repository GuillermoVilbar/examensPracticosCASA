package tema3_Arrays;

public class Enunciado {

	public static void main(String[] args) {
		int [][] tablero= {
				{10,20,30},
				{20,15,35},
				{4,2,3},
				{100,25,50}
		};
for(int i=0; i<tablero.length;i++) {
	double promedioCiudad = 0;
	for(int j=0; j<tablero[i].length;j++) {
		promedioCiudad += tablero[i][j];
		
	}
	System.out.println("El promedio es:" + (promedioCiudad / tablero[i].length));
}
	}

}
