package tema3_ArraysList;
import java.util.ArrayList;
import java.util.Arrays;

public class GestorTemperaturas {

	public static void mostrarMaximas(ArrayList<Double> lista) {
		for(double d: lista) {
			if (d>30.00) {
				System.out.println("ALERTA TEMPERATURA DE: " +d);
			}
		}

	}




	public static double calcularMedia(ArrayList<Double> lista) {
		double suma =0;
		for(int i=0; i<lista.size();i++) {
			suma += lista.get(i);
		}
		return suma/lista.size();
	}



	public static void main(String[] args) {

		ArrayList<Double>misTemperaturas = new ArrayList<>(Arrays.asList(5.5,40.1,20.5));

		mostrarMaximas(misTemperaturas);

		double promedioFinal= calcularMedia(misTemperaturas);

		System.out.println(promedioFinal);

	}
}


