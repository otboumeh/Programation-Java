package ud2;
import java.util.Scanner;
public class Ejer63PiramideInvertidaWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int k = 1;
		int j = 0;
		System.out.println("Give a number to make a pyramid");
		i = teclado.nextInt();
		int o = i;
		while(k <= i) {
			j = o;
			while(j < k) {
				System.out.printf("%d",k);
				j--;
			}
			System.out.print("\n");
			k++;
			o--;
		}
		teclado.close();
	}

	}
