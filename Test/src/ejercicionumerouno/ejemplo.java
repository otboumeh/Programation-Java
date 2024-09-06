package ejercicionumerouno;

import java.util.Scanner;

public class ejemplo {

	static Scanner teclado = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int j = 1;
		int resultado = 0;
		//pedir numero 1
		System.out.print("Dame un numero : ");
		i = teclado.nextInt();
		//pedir numero 2
		System.out.print("Dame otro numero : ");
		j = teclado.nextInt();

		 resultado = i + j;
			System.out.print("el resultado es : " + resultado);		
	}

}
