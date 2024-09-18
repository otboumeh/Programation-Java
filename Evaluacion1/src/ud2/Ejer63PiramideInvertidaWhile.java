package ud2;

import java.util.Scanner;

public class Ejer63PiramideInvertidaWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int j = 0;
		System.out.println("Give a number to make a pyramid");
		i = teclado.nextInt();
		while (i >= 1) {
			j = i;
			while (j > 0) {
				System.out.printf("%d", i);
				j--;
			}
			System.out.print("\n");
			i--;
		}
		teclado.close();
	}
}
