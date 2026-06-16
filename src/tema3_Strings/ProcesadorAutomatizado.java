package tema3_Strings;

public class ProcesadorAutomatizado {

	public static void main(String[] args) {
		String reporte = """
				Articulo:Ordenador
				Unidades:2
				PrecioBase:800.50
						""";

				
			String[] lineas= reporte.split("\n");
		
		String nombreArticulo = lineas[0].replace("Articulo", "").trim();
		
		String textoUnidades = lineas [1].replace("Unidades:", "").trim();
		String textoPrecio = lineas [2].replace("PrecioBase:", "").trim();
		int unidades = Integer.parseInt(textoUnidades);
		double precioBase = Double.parseDouble(textoPrecio);
		
		double subtotal = unidades* precioBase;
		double totalConIva = subtotal * 1.21;
		
		System.out.println("====== DETALLE DE FACTURA ======");
        System.out.println("Artículo:         " + nombreArticulo);
        System.out.println("Unidades:         " + unidades);
        System.out.println("Precio unitario:  " + precioBase + "€");
        System.out.println("--------------------------------");
        System.out.println("Subtotal:         " + subtotal + "€");
        System.out.println("Total (con IVA):  " + totalConIva + "€");
        System.out.println("================================");
	}

	}
