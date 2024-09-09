package numeros;

import java.util.Scanner;

public class Eercicio {
	
	static Scanner teclado = new Scanner(System.in);


	public static void main(String[] args) {
		
		int i = 0;
		
		System.out.println("Dame un numero : ");
		i = teclado.nextInt();
		if (i % 2 == 0){
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
	}
	}

