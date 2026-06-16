package EXAMEN_PRACTICO_CONTODO;

public abstract class Contenido {
	private String id;
	private String titulo;

	public Contenido(String id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}

	public String getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Contenido [id=" + id + ", titulo=" + titulo + "]";
	}



}
