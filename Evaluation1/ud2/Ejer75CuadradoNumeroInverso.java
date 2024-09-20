package ud2;
import java.util.Scanner;
public class Ejer75CuadradoNumeroInverso {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Give me the number of lines");
		int i = teclado.nextInt();
		int j = 1;
		int k = 1;
		while(i >=j) {
			k = 1;
			while(i>=k) {
				int m = i;
				while(k< m) {
			System.out.print("0 ");
			k++;}
				while(m>=i) {
				System.out.print(m);
				m--;}
				System.out.println("");
				j++;
			}
			
		}
		teclado.close();
	}

}
