package Cafeteria;

public class AppCafeteria  {

	

	public static void main(String[] args) {
	
Cafeteria miCafeteria1 = new Cafeteria("dolca", 1000,350);
CafeteraPremium miCafetera = new CafeteraPremium("nestle", 2500,1500, 50);

miCafeteria1.mostrarEstado();
miCafeteria1.hacerCafe(200);
miCafeteria1.mostrarEstado();
System.out.println("-------------------------------------");
System.out.println(miCafetera);
miCafetera.hacerCafe(250);
miCafetera.hacerEspuma();


	}

}
