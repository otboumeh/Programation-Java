package ud2;
import java.util.Scanner;
public class Ejer65PiramideEscaleraWhile {
	public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);

System.out.println("Give me a number to make a pyramid");

int i=teclado.nextInt();
int j = 1;
int k = 1 ;
while(j <= i) {
	k=1;
	while(k <= j) {
		System.out.print(k);
		k++;
	}
	System.out.println("");
j++;
}
teclado.close();

}
}