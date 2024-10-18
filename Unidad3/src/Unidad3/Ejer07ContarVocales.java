package Unidad3;

import java.util.Scanner;

public class Ejer07ContarVocales {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] contadorVocales = new int[5];
		String vocales = "aeiou";

		System.out.println("Introduce una cadena de texto:");
		String cadena = scanner.nextLine().toLowerCase();

		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			int indice = vocales.indexOf(caracter);
			if (indice != -1) {
				contadorVocales[indice]++;
			}
		}

		System.out.println("Número de veces que se ha introducido cada vocal:");
		for (int i = 0; i < vocales.length(); i++) {
			System.out.println("Vocal " + vocales.charAt(i) + ": " + contadorVocales[i]);
		}

		scanner.close();
	}
}