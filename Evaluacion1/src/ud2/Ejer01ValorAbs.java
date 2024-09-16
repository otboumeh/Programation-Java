package ud2;

import java.util.Scanner;

public class Ejer01ValorAbs {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		System.out.printf("Give me a number");
		i = teclado.nextInt();
		if (i < 0) {
			i = -i;
		}
		System.out.printf("here you go : %d", i);
		teclado.close();
	}

}
