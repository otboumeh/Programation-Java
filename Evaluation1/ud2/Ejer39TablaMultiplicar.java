package ud2;
import java.util.Scanner;
public class Ejer39TablaMultiplicar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1;
		int j = 0;
		System.out.println("Give me a number no make it");
		int k = teclado.nextInt();
		while(i<11) {
			j = k * i;
			
			System.out.printf("%d * %d = %d \n",k,i,j);
			i++;
		}
		teclado.close();

	}

}
