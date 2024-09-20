package ud2;
import java.util.Scanner;
public class Ejer74CuadradoNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Give me a number");
		int i = teclado.nextInt();
		int j = 1;
		int k = 1;
		int l = 1;
		while(j <= i) {
			k = j;
			while(k <= i)
			{	
				
				System.out.print(k + " ");
				k++;
				if(k > i && j != 1) {
					l = j - 1;
					while(l > 0) {
					System.out.print("0 ");
					l--;
				}
			}
			}
			j++;
			System.out.print("\n");
		}
		teclado.close();
	}
		

}

