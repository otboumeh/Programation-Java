package ud2;
import java.util.Scanner;
public class Ejercicio69PiramideResta1InvertidaWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Give me a number to make a pyramid");
		int i = teclado.nextInt();
		int j = 1;
		int k = 0;
		while(j <= i) {
			k = j;
			while(k <= i) {
				System.out.print(k);
				k++;
			}
			System.out.println("");
			j++;
		}
		teclado.close();
	}

}
