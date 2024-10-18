package Unidad3;
import java.util.Scanner;
public class Ejer13ArrayOpciones {
	private static void menu() {
		System.out.println("\n\n\nMENU DE MANEJO DE ARRAYS\r\n"
				+ "1. Incializar el array\r\n"
				+ "2. Ver el array\r\n"
				+ "3. Insertar un elemento (en la posición que le corresponda)\r\n"
				+ "4. Borrar un elemento (de su posición compactando el array)\r\n"
				+ "5. Salir");
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] array = new int[10];
		boolean omar = true;
		while(omar) {
		menu();
		int num = teclado.nextInt();
		switch(num) {
		case 1: for(int i = 0; i<10;i++) {
			array[i] = 0;
		}
		break;
		case 2: for(int i = 0 ; i<10;i++) {
			System.out.print(array[i]);
		}
		break;
		case 3: System.out.println("Elige una posición entre 0 y 9 para insertar");
				int n = teclado.nextInt();
				System.out.println("Elige un numero para insertar");
				int k = teclado.nextInt();
				array[n] = k;
				break;
		case 4: System.out.println("Elige una posición entre 0 y 9 para borrar");
		int o = teclado.nextInt();
		array[o] = 0;
		break;
		case 5 : omar = false;
		break;
		}
		
	}
		teclado.close();
	}
}
