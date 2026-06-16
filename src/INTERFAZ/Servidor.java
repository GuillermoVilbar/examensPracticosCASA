package INTERFAZ;

public class Servidor extends Dispositivo {
private  int almacenamientoTB;

public Servidor(String id, String marca, int almacenamientoTB) {
	super(id, marca);
	this.almacenamientoTB=almacenamientoTB;
}

@Override
public void enviarReporte() {
	System.out.println("Servidor " + this.getId() +": Enviando reporte de estado de discos a la nube");
	
}

@Override
public void mostrarEspecificaciones() {
	System.out.println(this.getId()+ this.getMarca() + almacenamientoTB);
	
}



	
}
