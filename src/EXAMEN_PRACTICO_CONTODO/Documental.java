package EXAMEN_PRACTICO_CONTODO;

public class Documental extends Contenido{
private String tematica;

public Documental(String id, String titulo, String tematica) {
	super(id, titulo);
	this.tematica=tematica;
	
}

public String getTematica() {
	return tematica;
}

@Override
public String toString() {
	return "Documental [tematica=" + tematica + "]";
}



}
