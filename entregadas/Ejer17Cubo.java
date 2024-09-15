package ud1;

import java.util.Scanner;

public class Ejer17Cubo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		System.out.println("dame un numero : ");
		i = teclado.nextInt();
		i = i * i * i;
		System.out.printf("%d", i);
		teclado.close();
	}

}
