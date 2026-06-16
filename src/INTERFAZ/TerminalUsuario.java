package INTERFAZ;

public class TerminalUsuario extends Dispositivo {
private String sistemaOperativo;

public TerminalUsuario(String id, String marca,String sistemaOperativo) {
	super(id, marca);
	this.sistemaOperativo=sistemaOperativo;
}

public String getSistemaOperativo() {
	return sistemaOperativo;
}

@Override
public void enviarReporte() {
System.out.println("Terminal " + this.getId() + ": Reporte de actividad de usuario enviado con exito ");
	
}

@Override
public void mostrarEspecificaciones() {
	System.out.println(this.getId() + this.getMarca() + this.getSistemaOperativo());
	
}




}
