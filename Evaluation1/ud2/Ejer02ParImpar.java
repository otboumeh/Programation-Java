package ud2;

import java.util.Scanner;

public class Ejer02ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		System.out.println("Give me a number");
		i = teclado.nextInt();
		if (i % 2 != 0) {
			System.out.println("el numero es Impar");
			System.exit(0);
		}
		System.out.println("el numero es par");
		teclado.close();
	}

}
