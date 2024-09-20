package ud2;
import java.util.Scanner;
public class Ejer46Cifras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Give me a number");
		int i = teclado.nextInt();
		int j = 0;
		if (i<0) {
			i = -i;
			System.out.println("-");
		}
		if(i < 10) {
			System.out.println(i);
		} else if (i >=10) {
		while(i  > 0) {
			j = i % 10;
			System.out.println(+j);
			i = i / 10;
			}
		}
		teclado.close();
	}
}
