package tema3_jabaBasico;

public class SimuladorPeajeInteligente_BuclesCondicionesAnidados {

	

	    public static void main(String[] args) {
	        
	        
	        for (int i = 1; i <= 5; i++) {
	            
	            // Declaramos las variables que cambiarán según el vehículo actual
	            char tipoVehiculo = ' ';
	            boolean tieneTarjeta = false;
	            double tarifaFinal = 0.0;
	            
	            // 1. ASIGNACIÓN SIMULADA: Usamos el switch para configurar cada vehículo según su número
	            switch (i) {
	                case 1:
	                    tipoVehiculo = 'C'; // Coche
	                    tieneTarjeta = true;
	                    break;
	                case 2:
	                    tipoVehiculo = 'M'; // Moto
	                    tieneTarjeta = false;
	                    break;
	                case 3:
	                    tipoVehiculo = 'T'; // Camión
	                    tieneTarjeta = true;
	                    break;
	                case 4:
	                    tipoVehiculo = 'X'; // Desconocido / Error
	                    tieneTarjeta = false;
	                    break;
	                case 5:
	                    tipoVehiculo = 'C'; // Coche
	                    tieneTarjeta = false;
	                    break;
	            }
	            
	            // 2. LÓGICA DE COBRO: Evaluamos el tipo de vehículo para calcular la tarifa
	            switch (tipoVehiculo) {
	                case 'C': // Caso Coche
	                    if (tieneTarjeta) {
	                        tarifaFinal = 5.0 - 2.0; // Descuento aplicado
	                    } else {
	                        tarifaFinal = 5.0; // Tarifa completa
	                    }
	                    break;
	                    
	                case 'M': // Caso Moto
	                    if (tieneTarjeta) {
	                        tarifaFinal = 3.0 - 1.0;
	                    } else {
	                        tarifaFinal = 3.0;
	                    }
	                    break;
	                    
	                case 'T': // Caso Camión
	                    tarifaFinal = 10.0; // Los camiones no tienen descuento
	                    break;
	                    
	                default: // Cualquier otro carácter (como la 'X') caerá aquí
	                    System.out.println("Vehículo " + i + ": ¡ALERTA! Tipo '" + tipoVehiculo + "' no identificado.");
	                    System.out.println("Activando protocolo de parada de emergencia...");
	                    // Usamos break con un truco: al estar dentro de un switch, este break SOLO sale del switch,
	                    // pero el enunciado nos pide detener el bucle completo. Para lograrlo, usaremos una técnica de control.
	                    tarifaFinal = -1.0; 
	                    break;
	            }
	            
	            // 3. COMPROBACIÓN DE SALIDA: Si la tarifa es -1.0, significa que debemos romper el bucle 'for'
	            if (tarifaFinal == -1.0) {
	                break; // Este break SÍ rompe y detiene el bucle for por completo
	            }
	            
	            // Si todo fue bien, imprimimos el ticket del vehículo
	            System.out.println("Vehículo " + i + ": Tipo [" + tipoVehiculo + "] - Tarifa aplicada: " + tarifaFinal + "€");
	        }
	        
	        System.out.println("--- Sistema de peaje fuera de servicio o detenido ---");
	    }
	
			
		
		
	

}
