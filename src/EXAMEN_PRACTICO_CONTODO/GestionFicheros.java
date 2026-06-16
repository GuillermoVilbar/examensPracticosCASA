package EXAMEN_PRACTICO_CONTODO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestionFicheros {

	public static void guardarLog(String texto) {
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	
	try {
		fw= new FileWriter("C:\\Users\\Guille escuela\\Desktop\\pruebasficheros\\log_descargas.txt",true);
		bw = new BufferedWriter(fw);
		
		bw.write(texto);
		bw.newLine();
		
	}catch(IOException e) {
		System.out.println("Error al escribir " + e.getMessage());
		
	}finally {
		try {
			if(bw!=null) {
				bw.close();
			}
			if(fw!=null) {
				fw.close();
			}
		
		
	}catch(IOException ex) {
		System.out.println("No se pudo guardar el archivo " + ex.getMessage());
	}
	}
	}
	
	public static void leerLog() {
		System.out.println("\n==================================================");
		System.out.println("📖 LEYENDO LOS DATOS GUARDADOS EN EL ARCHIVO .TXT:");
		System.out.println("==================================================");

		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Users\\Guille escuela\\Desktop\\pruebasficheros\\log_descargas.txt");
			br = new BufferedReader(fr);
			String Linea;
			
			System.out.println("\n LEYENDO CONTENIDO DEL ARCHIVO DESDE JAVA");
			while ((Linea = br.readLine()) !=null) {
				System.out.println(Linea);
			}
			System.out.println("FIN DE LA LECTURA DEL ARCHIVO");
			
			}catch(IOException e) {
				System.out.println("Error al intentar leer el archivo " + e.getMessage());
			} finally {
				try {
					if(br!=null) {
						br.close();
					}
					if (fr!=null) {
						fr.close();
					}
					System.out.println("cerrando archivo y apagando programa");
				}catch(IOException ex) {
					System.out.println("Error cerrando archivo " + ex.getMessage());
				}
			}
		
		
	}
}
	
	
	

		
		
		
		
		
		
		


