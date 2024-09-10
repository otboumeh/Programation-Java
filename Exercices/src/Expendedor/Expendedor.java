package Expendedor;

import java.util.Scanner;

public class Expendedor {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		int pedido;
		int[] monedas = {200, 100, 50, 20, 10, 5, 2, 1};  // Array con los valores de las monedas (en céntimos)
	    int cambioEnCentimos;
		double cafe = 0.43;
		double	refrescos = 1.11;
		double	agua = 0.36;
		double saldo = 0 ;
		double precio = 0;
        double cambio;

		System.out.println("Porfa escribe tu saldo");
		saldo = teclado.nextDouble();
        teclado.nextLine(); // necesario para usar Scan otra vez
		if (saldo < 0.36) {
		System.out.println("Saldo insuficiente");
		System.exit(0);
		}
			System.out.println("1- cafe = 0.43\n2- refrescos = 1.11\n3- agua = 0.36\nPorfa elige un producto");
            pedido = teclado.nextInt(); 
            switch(pedido) {
            case 1 :
            	precio = cafe;
            	break;
            case 2 :
            	precio = refrescos;
            	break;
            case 3:
            	precio = agua;
            	break;
            default :
            	System.out.println("Opcion incorecta \nAqui tienes vuesto sueldo : " + saldo);
				System.exit(0);
            }
            if (saldo < precio) {
                
            }
             cambio = saldo - precio;

            if (cambio > 0) {
                System.out.println("Gracias por tu compra. Aquí tienes tu cambio: ");

                cambioEnCentimos = (int) Math.round(cambio * 100);  // Convertir el cambio en céntimos

                for (int moneda : monedas) {
                    int cantidadMonedas = cambioEnCentimos / moneda;  // Cuántas monedas de este valor se pueden devolver
                    if (cantidadMonedas > 0) {
                        System.out.println(cantidadMonedas + " moneda(s) de " + (moneda / 100.0) + "€");
                        cambioEnCentimos = cambioEnCentimos % moneda;  // Actualizar el cambio restante
                    }
                }
            } else {
                System.out.println("Gracias por tu compra. No hay cambio.");
            }

            teclado.close();
        }
    
            		}
            	
            
		



