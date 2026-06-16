package EXAMEN2;

import java.util.ArrayList;

public final class Casas extends Inmueble{
private ArrayList<Habitacion> miHab;
private int baños;
private int plantas;
private int capacidadMaxima;

public Casas(int identificador, String direccion, int precio, double superficie, int baños, int plantas, int capacidadMaxima) {
	super(identificador, direccion, precio, superficie);
	this.baños=baños;
	this.plantas=plantas;
	this.capacidadMaxima=capacidadMaxima;
	this.miHab= new ArrayList<>();
	
}

public ArrayList<Habitacion> getMiHab() {
	return miHab;
}
public int getBaños() {
	return baños;
}
public void setBaños(int baños) {
	this.baños = baños;
}
public int getPlantas() {
	return plantas;
}
public void setPlantas(int plantas) {
	this.plantas = plantas;
}

public void añadirHab(Habitacion nuevaHab){
	if(this.miHab.size() < this.capacidadMaxima) {
		this.miHab.add(nuevaHab);
	}else {
		System.out.println("no puedes añadir mas habitaciones");
	}
	}
public int getNumeroHabitaciones() {
    return this.miHab.size();
}

@Override

public String toString() {
    // 1. Montamos la base con los datos de la casa
    String texto = "CASA: \n"
    			 +	"id=" + this.getIdentificador() // O getId(), según tu clase madre
                 + ", dir=" + this.getDireccion() 
                 + ", precio=" + this.getPrecio() + "€"
                 + ", m2=" + this.getSuperficie() 
                 + ", baños=" + this.baños 
                 + ", plantas=" + this.plantas 
    			 + ", habitaciones="+ this.getNumeroHabitaciones() + "\n";
    
    texto += "--- HABITACIONES ---\n";
    
    // 2. RECORREMOS el ArrayList para añadir cada habitación al texto
    for (Habitacion h : this.miHab) {
        // Esto llama automáticamente al toString() de cada habitación
        texto += "  -> " + h + "\n"; 
    }
    
    // 3. Al final del todo, cuando el texto ya está completo, hacemos el return
    return texto;
}



      }
	








