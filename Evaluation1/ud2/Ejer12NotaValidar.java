package ud2;

import java.util.Scanner;

public class Ejer12NotaValidar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i;
		System.out.println("Dame la nota");
		i = teclado.nextInt();
		if (i <= 10 && i >= 0) {
			System.out.println("Nota Valida");
			System.exit(0);
		}
		System.out.println("No valida");
		teclado.close();
		System.exit(0);
	}
}
