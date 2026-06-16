package EXAMEN2_2;
import java.util.ArrayList;
public class InstitutoGalileo {
	private String nombre;
	private ArrayList<Aula>misAulas;
	private ArrayList<Personas> miPersonal;
	public InstitutoGalileo(String nombre) {
		this.nombre = nombre;
		this.misAulas = new ArrayList<>();
		this.miPersonal = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Aula> getMisAulas() {
		return misAulas;
	}
	public ArrayList<Personas> getMiPersonal() {
		return miPersonal;
	}

	public void añadirAula(Aula nuevaAula) {
		this.misAulas.add(nuevaAula);
		System.out.println("El aula de "+ nuevaAula.getNombre() + " se ha incorporado al instituto");
	}
	public void añadirPersonal(Personas nuevoPersonal) {
		this.miPersonal.add(nuevoPersonal);
		System.out.println("Se ha dado de alta a: "+ nuevoPersonal.getNombre());

	}
	public void estadisticaPersonal() {
		int contProfesores =0;
		int contAdministrativo =0;
		int contLimpieza =0;
		for(Personas p : miPersonal) {
			if(p instanceof Profesores) {
				contProfesores ++;
			}else if (p instanceof Administrativo){
				contAdministrativo++;
			}else if(p instanceof PersonalLimpieza) {
				contLimpieza++;

			}
		}
		System.out.println("--- Estadistica de personal");
		System.out.println("Profesores: "+ contProfesores);
		System.out.println("Administrativos: "+ contAdministrativo);
		System.out.println("Personal de limpieza: "+ contLimpieza);
		System.out.println("Total personal: "+( contProfesores+ contAdministrativo+ contLimpieza));

	}

	public void mejorNotaAlumnoAula() {
		String nombre = "";
		double notaAlta=-1.0;
		String aula = "";

		for(Aula a: this.getMisAulas()){

			for (Alumnos al : a.getListaAlumnos()){
				if(al.getNotaMedia() > notaAlta) {
					notaAlta= al.getNotaMedia();
					nombre=al.getNombre();
					aula= a.getNombre();	
				}
			}

		}
		System.out.println("el mejor alumno es "+ nombre +
				", es el mejor del aula "+ aula +
				" pasando a todos con un " + notaAlta);
	}

	public void filtroNotas(double umbral) {
		System.out.println("-- ALUMNO CON NOTA MAYOR O IGUAL A: " + umbral + "----");
		for(Aula a : this.getMisAulas()) {
			System.out.println("\n Aula "+ a.getNombre());
			for(Alumnos alum : a.getListaAlumnos()) {
				if(alum.getNotaMedia() >= umbral) {
					System.out.println("- " + alum.getNombre() + " nota: " + alum.getNotaMedia());
				}
			}
		}

	}
	@Override
	public String toString() {
		return "InstitutoGalileo [nombre=" + nombre + ", misAulas=" + misAulas + ", miPersonal=" + miPersonal + "]";
	}






}
