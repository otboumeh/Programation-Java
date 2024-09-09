package ejercicionumerouno;

import java.util.Scanner;

public class ejemplo {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;

		// pedir numero 1
		System.out.print("Dame un numero : ");
		i = teclado.nextInt();
		if (i >= 0) {
			System.out.println("el valor absoluto es  " + i);
		} else if (i < 0) {
			System.out.println("el valor absoluto es " + (-i));
		} 
	}
}
