package ud1;
import java.util.Scanner;

public class Ejer03MostrarReal {
static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {

		double i;
		System.out.printf("Please enter your number :");
		i = teclado.nextDouble();
		System.out.printf("%f", i);
	}

}

