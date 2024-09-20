package ud2;

import java.util.Scanner;

public class Ejer03CalcularIva {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		System.out.println("Dame el valor");
		i = teclado.nextInt();
		if (i >= 20000) {
			System.out.println("16%");
			System.exit(0);
		}
		System.out.println("7%");
		teclado.close();

	}

}
