package Unidad3;
import java.util.Scanner;
public class Ejer15ArrayOrdenado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero =0;
		int[] array = new int[50];
		for(int i = 0; numero>0;i++) {
			System.out.println("Give me a positif number");
			
			numero = teclado.nextInt();
			if (numero >0) {
				array[i]= numero;
			}
			else {
				System.out.println("Sorry the number is negatif");
			}
		}
		teclado.close();
	}

}
