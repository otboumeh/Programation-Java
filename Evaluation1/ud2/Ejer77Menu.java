package ud2;
import java.util.Scanner;
public class Ejer77Menu {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int i;
		boolean j= true;
		char c;
		String k="Juan : 9\nOtmane : 10\nOmar : 8\nIsmail : 9.5\nRayane : 8\nNadia : 10";
		while(j == true) {
		System.out.println("Notas de programacíon\n\n1. Ver notas\n2. Ver alumnos\n3. Ver horarios\n0. Salir");
		i = teclado.nextInt();
		if(i == 1) {
			System.out.println(k);
			System.out.println("¿Desea regresar? [S/N]");
			c = teclado.next().charAt(0);
			if(c == 'S'|| c == 's' ) {
				j = true;
			}
			else {
				j = false;
			}
		}
		else if(i == 2) {
			System.out.println("Otmane\nOmar\nIsmail\nRayane\nNadia");
		}
		else if(i == 3) {
			System.out.println("El horario es de Lunes a Viernes de las 15h a 21h");
		}
		else if(i == 0) {
			j = false;
		}
		else {
			System.out.println("Error\n Unvalid option\n");
		}
		}
		teclado.close();
		System.exit(0);
	}

}
