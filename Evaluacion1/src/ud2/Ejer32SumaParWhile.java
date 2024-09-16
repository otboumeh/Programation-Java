package ud2;
import java.util.Scanner;
public class Ejer32SumaParWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int k = 0;
		System.out.println("Dame el numero : ");
		i = teclado.nextInt();
		while(i > j) {
			 k = k + j;  
			j++;
			j++;
		}
		if(k % 2 == 0) {
			 k = k + j;  
		}
		System.out.printf("El resultado es %d", k);
		teclado.close();
	}

}
