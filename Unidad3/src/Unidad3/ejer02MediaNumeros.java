package Unidad3;
import java.util.Scanner;
public class ejer02MediaNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [] numero_array = new int [50];
		int i = 0;
		int numero = 0;
		int resultado = 0;
		while(numero >= 0) {
			System.out.println("Dame un numero");
			numero = teclado.nextInt();
			if(numero > 0) {
				numero_array[i] = numero;
				i++;
			}
		}
		for( int j = 0;j<i; j++) {
			resultado = resultado + numero_array[j];
		}
		resultado = resultado / i;
		System.out.println("El resultado es " + resultado);
		teclado.close();

	}

}
