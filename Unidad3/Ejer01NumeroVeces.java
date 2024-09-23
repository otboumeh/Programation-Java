package Unidad3;
import java.util.Scanner;
public class Ejer01NumeroVeces {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [] array_numero = new int [50];
		int numero = 0;
		int j = 0;
		for(int i = 0;i< array_numero.length;i++) {
			array_numero[i] = 0;
		}
		while(numero>= 0) {
			System.out.println("dame un numero");
			numero = teclado.nextInt();
			if(numero <= 9 && numero >= 0) {
			array_numero[j] = numero;
			j++;
			}
			else {
				System.out.println("Invalid number");
			}
		}
		teclado.close();

	}

}
