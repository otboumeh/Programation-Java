package ud2;
import java.util.Scanner;
public class Ejer40TablaMultiplicarWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int j = 0;
		while(true) {
		System.out.println("Give me a number no make it");
		int k = teclado.nextInt();
		if(k == 0) {
			break;
		}
		int i = 1;
		while(i<11) {
			j = k * i;
			
			System.out.printf("%d * %d = %d \n",k,i,j);
			i++;
		}

	}
		teclado.close();

}
	}
