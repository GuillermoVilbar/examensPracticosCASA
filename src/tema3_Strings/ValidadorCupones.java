package tema3_Strings;

public class ValidadorCupones {

	public static void main(String[] args) {
		
		String datosCupon = """
		        CUPON:VIP-850-X
		        DESCUENTO: 15.5 
		        """;
		
		String[] lineasCupon = datosCupon.split("\n");
		
		// linea del cupon
		String[]  primeraLinea = lineasCupon[0].replace("CUPON:","").split("-");
		
		 //Validacion de categoria
		String categoria = primeraLinea[0];
		if(categoria.equals("VIP")) {
			System.out.println("Es un cupon VIP");
		}
		
		// Descuento
		String  segundaLinea = lineasCupon[1].replace("DESCUENTO:","").trim();
		// pasamos los numero del descuento a numeros reales en un double
		double numeroDescuento = Double.parseDouble(segundaLinea);
		
		String codigoTienda = "VIP";
		String codigoUsuario = primeraLinea[0];
		
		double precioOriginal = 150;
		double dineroDescontar = precioOriginal*(numeroDescuento/100);
		if(codigoTienda.equalsIgnoreCase(codigoUsuario)) {
			System.out.println("Para una compra de 150€ se le descontara " + numeroDescuento + "% y te queda en: " + (precioOriginal - dineroDescontar));
		}else {
			System.out.println("ERROR ERROR ERROR");
		}
		
		
	}

}
