package ud2;
import java.util.Scanner;
public class Ejer67PiramideEscaleraInvertidaWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Give me a number to make a pyramid");
		int i = teclado.nextInt();
		int k = i;
		while(i > 0) {
			k = 1;
			while(k <=i) {
				System.out.print(k);
			k++;
			}
			System.out.println("");
			i--;
		}
		teclado.close();
	}
}
