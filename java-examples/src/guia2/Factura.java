package guia2;

import java.util.Scanner;

public class Factura {
	
	static int FILAS_FACTURA = 11;
	static int COLUMNAS_FACTURA = 7;
	static int FILAS_PRODUCTO = 10;
	
	public static void main(String[] args) {		
		
		Object[][] matrizProductos = {
				{1, "Leche", 2000.0, true},
				{2, "Maiz", 1200.0, true},
				{3, "Azucar", 1200.0, false},
				{4, "Cerveza", 1300.0, false},
				{5, "Lulo", 800.0, true},
				{6, "Carne", 12000.0, true},
				{7, "Ron", 12500.0, false},
				{8, "Huevo", 200.0, false},
				{9, "Pan", 300.0, true},
				{10, "Lechuga", 1500.0, true}
		};
		
		int idProducto = 0;
		double pago=0;
		double regreso=0;
		double cantidadProducto = 0;
		int productosIngresados = 0;
		Object[][] matrizFactura = new Object[FILAS_FACTURA][COLUMNAS_FACTURA];
		
		Scanner leer = new Scanner(System.in);
				
		for(int i=0 ; i<FILAS_FACTURA ; i++) {
			System.out.print("Digite el ID del producto: ");
			idProducto = leer.nextInt();
			System.out.print("Digite el la cantidad del producto: ");
			cantidadProducto = leer.nextDouble();
			matrizFactura[i][0] = i+1;
			matrizFactura[i][1] = idProducto;
			matrizFactura[i][2] = obtenerNombreProducto(matrizProductos, idProducto);
			matrizFactura[i][3] = cantidadProducto;
			matrizFactura[i][4] = obtenerValorProducto(matrizProductos, idProducto);
			matrizFactura[i][5] = calcularIvaValorProducto(matrizProductos, idProducto);
			matrizFactura[i][6] = ((double)matrizFactura[i][3] * (double)matrizFactura[i][4]) + (double)matrizFactura[i][5];
			productosIngresados++;
			System.out.print("\nDesea llevar otro producto? (Si = 1, No = cualquier tecla)");
			if(!leer.next().equals("1")) {
				break;
			}
		}
		
		String columnas = "\nSu factura es\n\nItem\tID producto\tNombre producto\tCantidad\tValor unitario\tI.V.A.\tValor total";
		System.out.println(columnas);
		double valorTotalFactura = 0.0;
		for(int i=0 ; i<FILAS_FACTURA ; i++) {
			String valores = 
					String.valueOf(matrizFactura[i][0]) + "\t" +
					String.valueOf(matrizFactura[i][1]) + "\t\t" +
					String.valueOf(matrizFactura[i][2]) + "\t\t" +
					String.valueOf(matrizFactura[i][3]) + "\t\t" +
					String.valueOf(matrizFactura[i][4]) + "\t\t" +
					String.valueOf(matrizFactura[i][5]) + "\t" +
					String.valueOf(matrizFactura[i][6]);
			valorTotalFactura += (double)matrizFactura[i][6];
			System.out.println(valores);
			productosIngresados--;
			if(productosIngresados == 0) {
				break;
			}			
		}
		System.out.println("Valor total a pagar: " + String.valueOf(valorTotalFactura));

		do{
			System.out.println("\nDigite el pago, recuerde que debe ser igual o superior al valor de la factura ("+String.valueOf(valorTotalFactura)+"):");
			pago=leer.nextDouble();
		}while(pago<valorTotalFactura);
		
		regreso=calcularCambio(pago,valorTotalFactura);
		System.out.println("\nSu cambio es: "+regreso+"... Gracias por su compra!!!");
		leer.close();
	}
	
	private static String obtenerNombreProducto(Object[][] matrizProductos, int idProducto) {
		
		String nombreProducto = "";
		
		for(int i=0 ; i<FILAS_PRODUCTO ; i++) {
			if((int)matrizProductos[i][0] == idProducto) {
				nombreProducto = (String)matrizProductos[i][1];
				break;
			}
		}
		
		return nombreProducto;
	} 
	
	private static double obtenerValorProducto(Object[][] matrizProductos, int idProducto) {
		
		double valorProducto = 0;
		
		for(int i=0 ; i<FILAS_PRODUCTO ; i++) {
			if((int)matrizProductos[i][0] == idProducto) {
				valorProducto = (double)matrizProductos[i][2];
				break;
			}
		}
		
		return valorProducto;
	} 
	
	private static double calcularIvaValorProducto(Object[][] matrizProductos, int idProducto) {
		
		double valorIva = 0.0;
		
		for(int i=0 ; i<FILAS_PRODUCTO ; i++) {
			if((int)matrizProductos[i][0] == idProducto) {
				if((boolean)matrizProductos[i][3] == true) {
					valorIva = (double)matrizProductos[i][2] * 0.16;
					break;
				}
			}
		}
		
		return valorIva;
	} 
	
	private static double calcularCambio(double pago,double valorTotalFactura){
		return pago-valorTotalFactura;
	}

}