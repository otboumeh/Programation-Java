package ud2;
import java.util.Scanner;
public class Ejer29SumaNumerosWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int k = 0 ;
		int l = 0;
		System.out.println("Give me a number");
		i = teclado.nextInt();
		while(k <= i) {
			l = l + k;
			k++;
		}
		System.out.printf("%d",l);

		teclado.close();
	}

}
