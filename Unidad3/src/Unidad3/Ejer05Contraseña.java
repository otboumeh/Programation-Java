package Unidad3;

import java.util.Scanner;

public class Ejer05Contraseña {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pass = 1234;
		String numero = " ";
		
		int k = 0;
		boolean flag = true;
		while(flag) {
			System.out.println("Introduzca la contraseña");
			
				numero= teclado.nextLine();
				int num1 =Integer.parseInt(numero);
			
		
			if (num1 == pass) {
				System.out.println("The password is correct");
				flag = false;
			}
			else {
				System.out.println("The password is incorect try again");
				k++;
			}
			if (k == 3) {
				System.out.println("You depassed the number max of tries .... Good bye ");
				flag = false;
			}
		}
		teclado.close();
	}

}
