package EXAMEN_PRACTICO_CONTODO;

import java.util.ArrayList;

public class PlataformaStreaming {
	private String nombrePlataforma;
	private int cantMaxContenido;
	private ArrayList<Contenido> listaContenido;

	public PlataformaStreaming(String nombrePlataforma,int cantMaxContenido) {
		this.nombrePlataforma = nombrePlataforma;
		this.cantMaxContenido= cantMaxContenido;
		this.listaContenido = new ArrayList<>();
	}
	public String getNombrePlataforma() {

		return nombrePlataforma;
	}
	public int getCantMaxContenido() {
		return cantMaxContenido;
	}
	public void setCantMaxContenido(int cantMaxContenido) {
		this.cantMaxContenido = cantMaxContenido;
	}
	public ArrayList<Contenido> getListaContenido() {
		return listaContenido;
	}

	public void agregarContenido(Contenido c) {
		if(listaContenido.size() ==cantMaxContenido) {
			throw new IllegalStateException("No se pueden agregar mas contenido a esta lista");
		}else {
			listaContenido.add(c);
			System.out.println("Se agrego " + c.getTitulo() + " a la lista con exito");
		}
	}
	public void procesarDescargasYAuditoria() {
		int contProcesos =0;
		System.out.println("\n==================================================");
		System.out.println("📖 GUARDANDO LOS DATOS GUARDADOS EN EL ARCHIVO .TXT:");
		System.out.println("==================================================");
		GestionFicheros.guardarLog("INICIANDO AUDITORIA DE DESCARGAS");
		for (Contenido c : listaContenido) {
			if (c instanceof Descargable) {
				((Descargable) c).descargarContenido();
				contProcesos ++;
				

				
			}
			
			GestionFicheros.guardarLog("\nDescarga registrada: " + c.getId() + "\n Titulo:" + c.getTitulo());
		}
		System.out.println("Se procesaron "+ contProcesos + " descargas");
		
	}
	












}
