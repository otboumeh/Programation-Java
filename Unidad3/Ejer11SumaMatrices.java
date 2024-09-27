package Unidad3;

import java.util.Scanner;

public class Ejer11SumaMatrices {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de filas");
		int filas = teclado.nextInt();
		System.out.println("Introduce el numero de columnas");
		int columnas = teclado.nextInt();
		int[][] matrice = new int[filas][columnas];
		int[][] matrice2 = new int[filas][columnas];
		int[][] matriceResultado = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce un numero por la primera matrice ");
				matrice[i][j] = teclado.nextInt();
			}
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce un numero por la segunda matrice ");
				matrice2[i][j] = teclado.nextInt();
			}
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriceResultado[i][j] = matrice[i][j] + matrice2[i][j];
			}
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("El resultado de la fila nº " + (i + 1) + " columna nº " + j + " es : "
						+ matriceResultado[i][j]);
			}
		}
		teclado.close();
	}

}
