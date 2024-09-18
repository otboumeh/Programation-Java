package ud2;

import java.util.Scanner;

public class Ejer66PiramideEscaleraFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Give me a number to make a pyramid");
		int i = teclado.nextInt();
		for (int j = 1; j <= i; j++) {
			for (int k = 1; k <= j; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		teclado.close();
	}
}
