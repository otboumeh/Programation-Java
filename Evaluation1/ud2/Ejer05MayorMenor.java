package ud2;
import java.util.Scanner;
public class Ejer05MayorMenor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a = 0;
		int b = 0;
		System.out.println("Dame el numero a : ");

		a = teclado.nextInt();
		System.out.println("Dame el numero b : ");

		b = teclado.nextInt();
		if(a < b) {
			System.out.println("El numero 'b' es el mayor");
		}
		else if(a > b) {
			System.out.println("El numero 'a' es el mayor");
		}
		else{
			System.out.println("los dos numero son iguales");
		}
		teclado.close();
	}
}
