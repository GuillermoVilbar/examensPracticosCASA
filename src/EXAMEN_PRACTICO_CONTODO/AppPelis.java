package EXAMEN_PRACTICO_CONTODO;

public class AppPelis {

	public static void main(String[] args) {
		
		try {
			
		
		PlataformaStreaming miStream = new PlataformaStreaming("netflix",2);
		Contenido peli1 = new Pelicula("002B", "MATRIX", 130);
		Contenido peli2 = new Pelicula("003B", "TITANIC", 130);
		Contenido miDocu = new Documental("001A", "vida salvaje", "naturaleza");
		
		miStream.agregarContenido(peli1);
		miStream.agregarContenido(peli2);
		//miStream.agregarContenido(peli1);
		miStream.procesarDescargasYAuditoria();
		GestionFicheros.leerLog();
	}catch(IllegalStateException e) {
		System.out.println("ERROR: " + e.getMessage());
	}catch(IllegalArgumentException ex) {
		System.out.println("ERROR: "+ ex.getMessage());
	}
	}
	
		
	

}
