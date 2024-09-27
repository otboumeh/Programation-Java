package Unidad3;

import java.util.Scanner;

public class Ejer04ArraySumaPrimo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int numero = 0;
		int[] primo = new int[50];

		while (numero >= 0) {
			System.out.println("Dame un numero para hecer la suma");
			numero = teclado.nextInt();
			if (numero > -1) {
				primo[i] = numero;
				i++;
			}
		}
		numero = 0;
		while (i > 0) {
			numero = numero + primo[i];
			i--;
		}
		System.out.println("La sume de los numeros es : " + numero);
		boolean esPrimo = true;
		if (numero <= 1) {
			esPrimo = false;
		} else {
			for (int j = 2; j <= Math.sqrt(numero); j++) {
				if (numero % j == 0) {
					esPrimo = false;
					break;
				}
			}
		}

		if (esPrimo) {
			System.out.println("La suma es un número primo.");
		} else {
			System.out.println("La suma no es un número primo.");
		}
		teclado.close();

	}

}
