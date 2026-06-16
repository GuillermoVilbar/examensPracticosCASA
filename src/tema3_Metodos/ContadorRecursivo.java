package tema3_Metodos;

public class ContadorRecursivo {

	public static void cuentaAtras(int a) {
		System.out.println(a);
		if(a !=0) {
			cuentaAtras(a -1);
		}else {
			System.out.println("BOOM");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
	
int numero =10;
cuentaAtras(numero);













	}

}
