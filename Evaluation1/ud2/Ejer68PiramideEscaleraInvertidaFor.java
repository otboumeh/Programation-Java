package ud2;
import java.util.Scanner;
public class Ejer68PiramideEscaleraInvertidaFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Give me a number to make a pyramid");
		int i = teclado.nextInt();
		for(int j = i;j>0;j--) {
			for(int k =1;k <= j;k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		teclado.close();
	}

}
