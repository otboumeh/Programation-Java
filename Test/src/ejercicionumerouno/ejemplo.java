package ejercicionumerouno;

import java.util.Scanner;

public class ejemplo {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		int resultado = 0;
		int restar = 0;
		int multiplicar = 0;
		int dividir = 0;
		// pedir numero 1
		System.out.print("Dame un numero : ");
		i = teclado.nextInt();
		// pedir numero 2
		System.out.println("Dame otro numero : ");
		j = teclado.nextInt();
		if (j == 0)
		{
			System.out.println("no se puedo dividir en 0");
		}
		else {
		resultado = i + j;
		System.out.println("el resultado de sumar es : " + resultado);
		restar = i - j;
		System.out.println("el resultado de restar es : " + restar);
		multiplicar = i * j;
		System.out.println("el resultado de multiplicar es : " + multiplicar);
		dividir = i / j;
		
			System.out.println("el resultado de dividir es : " + dividir);

	}
}
}
