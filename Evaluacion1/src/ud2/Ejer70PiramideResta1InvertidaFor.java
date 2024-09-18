package ud2;

import java.util.Scanner;

public class Ejer70PiramideResta1InvertidaFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Give me a number");
		int i = teclado.nextInt();
		for (int j = 1; j <= i; j++) {
			for (int k = j; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		teclado.close();
	}

}
