package ud2;

import java.util.Scanner;

public class Ejer30SumaNumerosFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame numero");
		int l = 0;
		int k = 0;
		k = teclado.nextInt();
		for (int i = 0; i <= k; i++) {
			l = l + i;
		}
		System.out.printf("%d", l);
		teclado.close();
	}
}
