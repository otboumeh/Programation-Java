package ud1;
import java.util.Scanner;
public class Ejercicio05MostrarCadena {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String str ="";
		System.out.println("Enter your phrase");
		str=teclado.nextLine();
		System.out.printf("%s", str);
		teclado.close();
	}

}
