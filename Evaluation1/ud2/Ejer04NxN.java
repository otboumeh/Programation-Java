package ud2;

import java.util.Scanner;

public class Ejer04NxN {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		System.out.println("Give me a number");
		i = teclado.nextInt();
		i = i * i;
		if (i > 100) {
			i = i - 100;
		}
		System.out.println("here you go : " + i);
		teclado.close();
	}

}
