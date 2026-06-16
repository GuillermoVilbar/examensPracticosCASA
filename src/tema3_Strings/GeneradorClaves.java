package tema3_Strings;

public class GeneradorClaves {

	public static void main(String[] args) {
	String nombre = " alberto";
	String apellido = "fernandez";
	String anyoNacimiento ="1995";
	String nombreLimpio = nombre.trim().substring(0,3).toUpperCase();
	
	String apellidoNuevo = apellido.substring(0,3).toLowerCase();
	String anyio = anyoNacimiento.replace("19", "**");
	String passwordFinal = nombreLimpio + apellidoNuevo + anyio;
	
	System.out.println("Contraseña provisional generada:" + passwordFinal);
	}

}
