package ud2;
import java.util.Scanner;
public class Ejer71PiramideResta1RevesInvertidaWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	System.out.println("Give me a number to make a pyramid");
	int i = teclado.nextInt();
	int j ;
	while(i > 0) {
		j = i;
		while(j >0) {
				System.out.print(j);
				j--;
		}
		System.out.println("");
		i--;
	}
	teclado.close();
	}

}
