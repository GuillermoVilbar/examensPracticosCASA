package EXAMEN2;
import java.util.ArrayList;
public class AppInmueble {

	public static void main(String[] args) {
		ArrayList<Inmueble> misInmuebles= new ArrayList<>();
		Casas micasa1 = new Casas(2202,"Calle via 3",65000,200,2,4,3);
		LocalesComerciales miLocal = new LocalesComerciales(2201,"Calle via 3",65000,200, false);
		Habitacion miDormitorio1 = new Habitacion(15.0,2,"salon");
		micasa1.añadirHab(miDormitorio1);
		micasa1.añadirHab(new Habitacion(20.0,4,"Dormitorio"));

		misInmuebles.add(miLocal);
		misInmuebles.add(micasa1);
		for (Inmueble i : misInmuebles) {
			System.out.println(i.toString());
		}
	}



}
