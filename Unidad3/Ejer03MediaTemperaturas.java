package Unidad3;

import java.util.Scanner;

public class Ejer03MediaTemperaturas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] temperatura = new int [50];
		int i = 0;
		int j = 0;
		int numero = 0;
		while(numero> -999) {
			System.out.println("Give me a number");
			numero = teclado.nextInt();
			if(numero >-999) {
				temperatura[i]= numero;
				i++;
			}
		}
		j = i ;
		numero = 0;
		while(i >=0) {
			numero = numero +temperatura[i];
			i--;
		}
		numero = numero / j;
		System.out.println("La temperatura media es : " + numero);
		i =0;
		while(i<j) {
			if(temperatura[i] < numero) {
				System.out.println("la temperatura : " + temperatura[i] +" es menor que la temperatura media");
			}
			else if(temperatura[i] > numero) {
				System.out.println("la temperatura : " + temperatura[i] +" es mayor que la temperatura media");
			}
			else {
				System.out.println("la temperatura : " + temperatura[i] +" es igual que la temperatura media");
			}
			i++;
		}
		teclado.close();
	}

}
