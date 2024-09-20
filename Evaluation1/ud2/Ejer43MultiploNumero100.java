package ud2;

import java.util.Scanner;

public class Ejer43MultiploNumero100 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int numero = teclado.nextInt();

		System.out.println("Los primeros 100 múltiplos de " + numero + " son:");
		for (int i = 1; i <= 100; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
			teclado.close();
		}
	}
}