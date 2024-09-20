package ud2;

import java.util.Scanner;

public class Ejer37Fibonacci {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Give me a number :");
		int n = teclado.nextInt();
		int a = 0, b = 1, c = 0, i = 2;

		if (n == 0) {
			c = 0;
		} else if (n == 1) {
			c = 1;
		} else {
			while (i <= n) {
				c = a + b;
				a = b;
				b = c;
				i++;
			}
		}

		System.out.println("The Fibonacci number for " + n + " is: " + c);
		teclado.close();
	}
}
