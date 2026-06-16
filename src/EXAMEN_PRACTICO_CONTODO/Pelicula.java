package EXAMEN_PRACTICO_CONTODO;

public class Pelicula extends Contenido implements Descargable{
	private int duracionMinutos;

	public Pelicula(String id, String titulo, int duracionMinutos) {
		super(id, titulo);
		if(duracionMinutos <=0){
			throw new IllegalArgumentException("La pelicula debe durar mas de 0 minutos");
		}
		this.duracionMinutos=duracionMinutos;
	}

	@Override
	public void descargarContenido() {
		System.out.println("Pelicula " + this.getTitulo() +": Descargando archivo de video de alta definicion");


	}

	@Override
	public String toString() {
		return "Pelicula [duracionMinutos=" + duracionMinutos + "]";
	}






}
