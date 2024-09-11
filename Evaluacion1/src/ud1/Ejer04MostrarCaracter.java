package ud1;
import java.util.Scanner;

public class Ejer04MostrarCaracter {
	

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		char c;
		
		System.out.printf("Write the caracter here : ");
		c = teclado.next().charAt(0);
		System.out.printf("%c",c);
        teclado.close();
	}
}
