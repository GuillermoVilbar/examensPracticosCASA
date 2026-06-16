package INTERFAZ;

public abstract class Dispositivo implements Conectado {

	private String id;
	private String marca;
	public Dispositivo(String id, String marca) {
		this.id = id;
		this.marca = marca;
	}
	public String getId() {
		return id;
	}
	public String getMarca() {
		return marca;
	}
	
	public abstract void mostrarEspecificaciones();
	
	
		
		
	}
	
	
	
		
	
	
	
	
	
	

