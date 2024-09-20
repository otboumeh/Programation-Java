package ud1;
import java.util.Scanner;
public class Ejer06MostrarReal2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double pi = 3.14566685;
		System.out.println("Give me the number");
		pi = teclado.nextDouble();
		System.out.printf("%.2f",pi);
		teclado.close();
	}

}
