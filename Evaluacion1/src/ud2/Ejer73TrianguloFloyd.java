package ud2;
import java.util.Scanner;
public class Ejer73TrianguloFloyd {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Give me the number of line");
		int i = teclado.nextInt();
		int j = 1;
		int k = 1;
		int l = 1;
		while(j <=i) {
			l= 1;
			while(l<=j) {
			System.out.printf("%d",k);
			k++;
			l++;
			if(l <= j) {
				System.out.print(" ");
			}
			}
			System.out.println("");
			j++;
		}
		teclado.close();
	}

}
