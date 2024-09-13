package ud2;

import java.util.Scanner;

public class Ejerc05MayorMenor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i;
		int j;
		System.out.println("Give me the first number");
		i = teclado.nextInt();
		System.out.println("Give me the second number");
		j = teclado.nextInt();
		if (i < j) {
			System.out.printf("the result is %d < %d", i, j);
		} else if (j < i) {
			System.out.printf("the result is %d < %d", j, i);
		} else {
			System.out.printf("the result is %d = %d", j, i);
		}
		teclado.close();
	}
}
