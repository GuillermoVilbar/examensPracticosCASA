package INTERFAZ;

public class AppParque {

	public static void main(String[] args) {
		
		try{
			ParqueTecnologico miParque1 = new ParqueTecnologico("galileo");
		
		
		Laboratorio miLabo1 = new Laboratorio( "GALILEO",2);
		Laboratorio miLabo2 = new Laboratorio( "GALILEOs",5);
		miParque1.agregarLaboratorio(miLabo1);
		

		Dispositivo miDispo1 = new Servidor("a12 ", "samsung", 500);
		Dispositivo miDispo2 = new Servidor("b12 ", "samsung", 500);
		Dispositivo miDispo3 = new TerminalUsuario("c12 ", "samsung", "Windows");
		miLabo1.agregarDispositivo(miDispo1);
		miLabo1.agregarDispositivo(miDispo2);
	
		
		miParque1.auditarRedParque();
		GestionFicheros.leerDatos();
		
		}catch(IllegalArgumentException e) {
			System.out.println("ERROR de validacion: " + e.getMessage());
			
		}catch(IllegalStateException e) {
			System.out.println("ERROR DE CAPACIDAD: " + e.getMessage());
			
		}
		finally {
		    // 🔔 ESTO SE EJECUTA SÍ O SÍ
		    System.out.println("🔏 Bloque Finally: Limpiando recursos y cerrando la App.");
		}
	}

}
