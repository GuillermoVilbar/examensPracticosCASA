package EXAMEN2_2;
import java.util.ArrayList;
public class Aula {
	private String nombre;
	private int aforoMaximo;
	private ArrayList<Alumnos> listaAlumnos;

	public Aula(String nombre, int aforoMaximo) {
		this.nombre = nombre;
		this.aforoMaximo = aforoMaximo;
		this.listaAlumnos=new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public int getAforoMaximo() {
		return aforoMaximo;
	}

	public ArrayList<Alumnos> getListaAlumnos() {
		return listaAlumnos;
	}
	public void añadirAlumno(Alumnos Alumno) {
		if(listaAlumnos.size() >= aforoMaximo) {
			System.out.println("el Aula de "+ this.getNombre()+ " esta llena, no entra nadie mas");
		}else {
			listaAlumnos.add(Alumno);
		}
	}

	@Override
	public String toString() {
		return "Aula [nombre=" + nombre + ", aforoMaximo=" + aforoMaximo + ", listaAlumnos=" + listaAlumnos + "]";
	}


}
