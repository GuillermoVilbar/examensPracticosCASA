package INTERFAZ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestionFicheros {

	public static void guardarDatos(String texto) {

		FileWriter fw=null;
		BufferedWriter bw = null;

		try { 
			fw =new FileWriter("C:\\Users\\Guille escuela\\Desktop\\pruebasficheros\\auditoriaa.txt",true);
			bw = new BufferedWriter(fw);

			bw.write(texto);
			bw.newLine();
			System.out.println("Texto guardado temporalmente en el buffer.");

		}catch (IOException e) {
			System.out.println("Error al escribir "+ e.getMessage());
		}finally {
			try {
				if (bw!=null) {
					bw.close();
				}
				if(fw!=null) {
					fw.close();
				}
				System.out.println("Archivo cerrado de forma segura");
			} catch(IOException ex) {
				System.out.println("ERROR critico al intentar cerrar el archivo " + ex.getMessage());
			}
		}
	}

	public static void leerDatos() {
		System.out.println("\n==================================================");
		System.out.println("📖 LEYENDO LOS DATOS GUARDADOS EN EL ARCHIVO .TXT:");
		System.out.println("==================================================");

		FileReader fr=null;
		BufferedReader br =null;

		try {

			fr= new FileReader("C:\\Users\\Guille escuela\\Desktop\\pruebasficheros\\auditoriaa.txt");
			br = new BufferedReader(fr);
			String linea;

			System.out.println("\n LEYENDO CONTENIDO DEL ARCHIVO DESDE JAVA");

			while ((linea = br.readLine()) !=null){
				System.out.println(linea);
			}

			System.out.println("--- FIN DE LA LECTURA DEL ARCHIVO----\n");


		}catch (IOException e) {
			System.out.println("No se pudo leer el archivo " + e.getMessage());
		}finally {
			try {
				if(br != null) br.close();
				if(fr !=null) fr.close();
			} catch (IOException ex) {
				System.out.println("ERROR al cerrar el lector " + ex.getMessage());
			}
		}

	}
}















