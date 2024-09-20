package ud2;

import java.util.Scanner;

public class Ejer62PiramideFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Give me the number to make you the pyramid");
		int i = teclado.nextInt();
		for (int k = 1; k <= i; k++) {
			for (int j = 0; j < k; j++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		teclado.close();
	}

}
