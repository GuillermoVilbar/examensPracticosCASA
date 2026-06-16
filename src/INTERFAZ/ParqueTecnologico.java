package INTERFAZ;

public class ParqueTecnologico {
	
	private String nombreParque;
	private Laboratorio[] miLaboratorio;
	private int contLaboratorio;
	
	
	public ParqueTecnologico(String nombreParque) {
		super();
		this.nombreParque = nombreParque;
		this.miLaboratorio = new Laboratorio[1];
		this.contLaboratorio=0;
	}


	public String getNombreParque() {
		return nombreParque;
	}


	public Laboratorio[] getMiLaboratorio() {
		return miLaboratorio;
	}
	
	public void agregarLaboratorio(Laboratorio labo) {
		if(this.contLaboratorio >= this.miLaboratorio.length) {
			throw new IllegalStateException("EL parque esta lleno no puedes meter mas laboratorios");
		}
			this.miLaboratorio[this.contLaboratorio] = labo;
			System.out.println("se agrego el laboratorio " + labo.getNombreSala() + "con exito");
			contLaboratorio++;
	}
	
	
	public void auditarRedParque() {
		
		int contLaboratorios =0;
		int contDispositivos=0;
GestionFicheros.guardarDatos("---INICIO DE LA AUDITORAI EN RED---" );

		System.out.println("auditoria de red de parque");
		System.out.println("En este parque " + this.getNombreParque());
		
		for(Laboratorio l : miLaboratorio) { 
			if(l!=null) {
				contLaboratorios++;
				for(Dispositivo d : l.getMisDispositivos()) {
					
					if(d!=null) {
						if(d instanceof Conectado) {
							((Conectado)d).enviarReporte();
						
						
						contDispositivos++;
						GestionFicheros.guardarDatos("Dispositivo auditado con id ["+ d.getId() + "] de la marca ["+ d.getMarca() + "]");
					}	
				}
				}
			}
			}
			System.out.println(" Se analizo" + contLaboratorios+ " laboratorio(S) \n"+
								 "Se encontro un total de " +contDispositivos + " dispositivos reportando ");
								 
				GestionFicheros.guardarDatos("Fin de la auditoria, Total de laboratorios: " + contLaboratorios + " \n Total de dispositivos " + contDispositivos + "\n");			 
			

	}
	
}

	
		

	


