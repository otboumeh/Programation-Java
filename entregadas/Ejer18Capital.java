package ud1;

import java.util.Scanner;

public class Ejer18Capital {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la cantidad en euros: ");
        double cantidad = teclado.nextDouble();
        System.out.print("Introduce el tipo de interes: ");
        double tipoInteres = teclado.nextDouble();
        System.out.print("Introduce el periodo de tiempo en dias: ");
        int tiempo = teclado.nextInt();
        double interes = (cantidad * tipoInteres * tiempo) / (360 * 100);
        System.out.printf("El interes producido es: %.2f euros", interes);
        teclado.close();
    }
}

