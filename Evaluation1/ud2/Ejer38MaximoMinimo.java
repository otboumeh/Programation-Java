package ud2;
import java.util.Scanner;
public class Ejer38MaximoMinimo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while(true) {
			System.out.println("Give me a number");
			int num = teclado.nextInt();
			if (num <0) {
				break;
			}
			if (num > max) {
				max = num;
			}
			if (num < min)
			{
				min = num;
			}
		}
		System.out.printf("The max number is :%d \n the min number is : %d\n", max,min);
			teclado.close();
		}
	}
