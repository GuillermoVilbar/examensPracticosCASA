package tema3_Metodos;

public class Sobrecarga {

	public static int sumar(int a, int b) {
		int suma= a + b;
		
		return suma;
	}
	public static int sumar(int a, int b, int c) {
		int suma= a + b + c;
		
		return suma;
	}
	public static double sumar(double a, double b) {
		double suma= a + b ;
		
		return suma;
	}
	
	
	
	
	public static void main(String[] args) {
		
int a= 5;
int b= 10;
int c= 15;
double d= 12.25;
double e = 20.25;

System.out.println(sumar(a, c));
System.out.println(sumar(a, d));
System.out.println(sumar(e, b));
System.out.println(sumar(b, c));
//Esta llamada usará el segundo método de cabeza porque le pasas 3 enteros directos
System.out.println(sumar(a, b, c)); 

//Esta llamada usará el tercer método directamente con dos doubles reales
System.out.println(sumar(d, e));
	}

}
