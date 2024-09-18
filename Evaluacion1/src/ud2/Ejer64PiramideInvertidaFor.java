package ud2;

import java.util.Scanner;

public class Ejer64PiramideInvertidaFor {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
System.out.println("Give me a number to make a reverse PYRAMID");
int i = teclado.nextInt();
for(int j = i; j >=1;j--) {
	for(int k = j; k>0; k--) {
		System.out.print(i);
	}
	System.out.println("");
	i--;
}
teclado.close();
	}

}
