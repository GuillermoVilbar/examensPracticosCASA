package EXAMEN2;

public final class LocalesComerciales extends Inmueble{
private boolean salidaHumo;

public LocalesComerciales(int identificador, String direccion, int precio, double superficie, boolean salidaHumo) {
	super(identificador, direccion, precio, superficie);
	this.salidaHumo=salidaHumo;
}

public boolean isSalidaHumo() {
	return salidaHumo;
}

@Override
public String toString() {
    return "Local Comercial \n"
    	 + " [ id=" + this.getIdentificador() 
         + ", dir=" + this.getDireccion() 
         + ", precio=" + this.getPrecio() 
         + ", m²=" + this.getSuperficie() 
         + ", salidaHumos=" + this.salidaHumo + "]";










}
}
