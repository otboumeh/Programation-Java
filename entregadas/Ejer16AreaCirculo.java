package ud1;

import java.util.Scanner;

public class Ejer16AreaCirculo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el valor del radio: ");
		double radio = teclado.nextDouble();
		double area = Math.PI * Math.pow(radio, 2);
		System.out.printf("El area del circulo es: %.2f%n", area);
		teclado.close();
	}
}
