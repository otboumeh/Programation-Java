package ud2;

import java.util.Scanner;

public class Ejer36Factorial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		System.out.println("Give me the value");
		i = teclado.nextInt();
		int k = i;
		while (k > 1) {
			k--;
			i = i * k;
		}
		System.out.printf("This is the final value : %d", i);
		teclado.close();
	}
}
