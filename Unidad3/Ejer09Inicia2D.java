package Unidad3;
import java.util.Scanner;
public class Ejer09Inicia2D {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//  I need to declare a new matrice [i][j]
		//I need to declare the number of columns and raws 
		// I need to run it and full it with #
		// I need to run it again and print it
		int filas = 0;
		int columnas = 0;
		System.out.println("Introduce el numero de filas ");
		filas = teclado.nextInt();
		System.out.println("Introduce el numero de columnas ");
		columnas = teclado.nextInt();
		String [][] matrice = new String[filas][columnas];
		for (int i = 0; i < filas ; i ++) {
			for (int j = 0 ; j < columnas;j++) {
				matrice[i][j] = "#";
			}
		}
		for (int i = 0; i < filas ; i ++) {
			for (int j = 0 ; j < columnas;j++) {
				System.out.printf("%s", matrice[i][j]);
				if(j == columnas - 1) {
					System.out.println();
				}
			}
		}
		
		teclado.close();
	}

}
