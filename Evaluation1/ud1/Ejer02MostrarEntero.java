package ud1;
import java.util.Scanner;
public class Ejer02MostrarEntero {
static Scanner teclado =new Scanner(System.in);
	public static void main(String[] args) {

		int i;
		System.out.printf("Please enter your number :");
		i = teclado.nextInt();
		System.out.printf("%d", i);
	}

}
