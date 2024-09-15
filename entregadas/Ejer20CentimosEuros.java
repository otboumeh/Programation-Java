package ud1;

import java.util.Scanner;

public class Ejer20CentimosEuros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una cantidad en euros: ");
		double cantidad = teclado.nextDouble();

		int euros = (int) cantidad;
		int centimos = (int) Math.round((cantidad - euros) * 100);

		System.out.println("Euros: " + euros);
		System.out.println("Céntimos: " + centimos);

		teclado.close();
	}
}
