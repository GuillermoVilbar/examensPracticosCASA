package INTERFAZ;

public class Laboratorio {

	private String nombreSala;
	private int capacidadMaximaDispositivos;
	private int contDispositivos;
	private Dispositivo[] misDispositivos;
	public Laboratorio(String nombreSala, int capacidadMaximaDispositivos) {

		if(capacidadMaximaDispositivos <=0) {
			throw new IllegalArgumentException("La capacidad del laboratorio debe ser mayor a 0");
		}
		if(nombreSala==null || nombreSala.trim().isEmpty()) {
			throw new IllegalArgumentException("el nombre de la sala no puede estar vacio");
		}
		if(capacidadMaximaDispositivos >=100) {
			throw new IllegalArgumentException("La capacidad del laboratorio debe ser menor a 100");
		}

		this.nombreSala = nombreSala;
		this.capacidadMaximaDispositivos = capacidadMaximaDispositivos;
		this.contDispositivos = 0;
		this.misDispositivos = new Dispositivo [capacidadMaximaDispositivos];



	}








	public String getNombreSala() {
		return nombreSala;
	}
	public int getCapacidadMaximaDispositivos() {
		return capacidadMaximaDispositivos;
	}
	public int getContDispositivos() {
		return contDispositivos;
	}
	public Dispositivo[] getMisDispositivos() {
		return misDispositivos;
	}

	public void agregarDispositivo( Dispositivo nuevoD) {
		
		if(this.contDispositivos >= this.capacidadMaximaDispositivos) {
			throw new IllegalStateException("no se pueden agregar mas dispositivos porque esta lleno el laboratorio");
		}
		
		this.misDispositivos[this.contDispositivos]= nuevoD;
		contDispositivos++;


	}



}
