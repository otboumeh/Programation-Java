package Unidad3;
import java.util.Scanner;
public class Ejer08ArraySuma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int filas = 0;
		int columnas = 0;
		
		System.out.println("Indroduce el numero de filas : \n");
		filas = teclado.nextInt();
		System.out.println("Intruduze el numero de columnas : \n");
		columnas = teclado.nextInt();
		int matriz[][] = new int[filas][columnas];
		for(int i = 0; i <filas;i++) {
			for(int j = 0 ; j < columnas ; j++) {
				System.out.println("Introduce un numero");
			    matriz[i][j] = teclado.nextInt();
			}
		}
		int [] sumaFilas = new int[filas];
		for (int i = 0 ; i < filas ; i++) {
			int suma = 0;
			for(int j = 0; j< columnas;j++) {
				suma = matriz[i][j] + suma;
			}
			sumaFilas[i] = suma;
		}
		for(int i = 0; i < filas;i++) {
			System.out.println("La suma de la fila numero : " + (i+1) + " es : " + sumaFilas[i]);
		}
		teclado.close();

	}

}
