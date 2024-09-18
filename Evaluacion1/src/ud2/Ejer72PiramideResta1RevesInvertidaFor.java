package ud2;

import java.util.Scanner;

public class Ejer72PiramideResta1RevesInvertidaFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Give me a number to make a pryramid");
		int i = teclado.nextInt();
		for (int j = i; j > 0; j--) {
			for (int k = j; k > 0; k--) {
				System.out.print(k);
			}
			System.out.print("\n");
		}
		teclado.close();
	}
}
