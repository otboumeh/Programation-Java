package ud2;

import java.util.Scanner;

public class Ejer11MenuIf {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		System.out.println(
				"Porfa elige la operación \n 1 - Sumar \n 2 - Restat \n 3 - Multiplicar \n 4 - Dividir\n 5 - Resto \n 6 - Salir");
		k = teclado.nextInt();
		if (k == 6) {
			System.out.printf("Good bye");
			System.exit(0);
		}
		if (k != 1 && k != 2 && k != 3 && k != 4 && k != 5 && k != 6 ) {
			System.out.printf("Invalid option , \nGood bye");
			System.exit(0);
		}
		System.out.println("Give me the first number :");
		i = teclado.nextInt();
		System.out.println("Give me the second number :");
		j = teclado.nextInt();

		switch (k) {
		case 1:
			l = i + j;
			System.out.printf("The result is %d ", l);
			break;
		case 2:
			l = i - j;
			System.out.printf("The result is %d ", l);
			break;
		case 3:
			l = i * j;
			System.out.printf("The result is %d ", l);
			break;
		case 4:
			if (j == 0) {
				System.out.println("No se puede dividir en 0");
				System.exit(0);
			}
			l = i / j;
			System.out.printf("The result is %d ", l);
			break;
		case 5:
			if (j == 0) {
				System.out.println("No se puede dividir en 0");
				System.exit(0);
			}
			l = i % j;
			System.out.printf("The result is %d ", l);
			break;
		default:
			System.out.printf("Invalid option , Good bye");
			System.exit(0);

		}
		teclado.close();
		System.exit(0);
	}

}
