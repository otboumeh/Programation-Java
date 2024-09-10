package Expendedor;

import java.util.Scanner;

public class Expendedor {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		int pedido;
		double cafe = 0.43;
		double	refrescos = 1.11;
		double	agua = 0.36;
		double saldo = 0 ;
		double precio = 0;
        int[] monedas = {200, 100, 50, 20, 10, 5, 2, 1};
        int cambioEnCentimos;
        double cambio;

		System.out.println("Porfa escribe tu saldo");
		saldo = teclado.nextDouble();
        teclado.nextLine(); // necesario para usar Scan otra vez
		if (saldo < 0.36) {
		System.out.println("Saldo insuficiente");
		System.exit(0);
		}
			System.out.println("cafe = 0.43\nrefrescos = 1.11\nagua = 0.36\nPorfa elige un producto");
            pedido = teclado.nextInt(); 
            if(pedido != 1 && pedido != 2 && pedido != 3) {
					System.out.println("Opcion incorecta \nAqui tienes vuesto sueldo : " + saldo);
					System.exit(0);
		}
            if (pedido == 1) {
                precio = cafe;
            } else if (pedido == 2) {
                precio = refrescos;
            } else if (pedido == 3) {
                precio = agua;
            }
            if (saldo < precio) {
                System.out.println("Saldo insuficiente");
                System.exit(0);
            }
             cambio = saldo - precio;

            if (cambio > 0) {
                System.out.println("Gracias por tu compra. Aquí tienes tu cambio: ");

                // Array con los valores de las monedas (en céntimos)
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
            	
            
		



