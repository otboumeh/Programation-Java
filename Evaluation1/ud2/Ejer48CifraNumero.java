package ud2;

import java.util.Scanner;

public class Ejer48CifraNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		while (true) {
			i = teclado.nextInt();
			System.out.println("Give me a number");
			if (i < 0) {
				break;
			}
		}
		System.out.println("The number" + i + " is negative");
		teclado.close();
	}
}
