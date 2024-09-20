package ud2;

import java.util.Scanner;

public class Ejer31SumaNumerosDecrecienteWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int l = 0;
		do {
			System.out.println("Give me a number");
			i = teclado.nextInt();
			l = l + i;
		} while(i < 0); 
		System.out.printf("el resultado es %d",l);
		teclado.close();
	}

}
