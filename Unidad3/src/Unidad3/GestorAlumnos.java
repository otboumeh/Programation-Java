package Unidad3;

import java.util.Scanner;

public class GestorAlumnos {
	public static String[] alumnos = new String[20];
	public static int i = 0;
	static Scanner teclado = new Scanner(System.in);

	private static void ShowMenu() {
		System.out.println();
		System.out.println("Elige una opción");
		System.out.println("1- Añadir un Alumno:");
		System.out.println("2- Visualizar todos los Alumnos:");
		System.out.println("3- Visualizar un Alumno:");
		System.out.println("4- Modificar un Alumno:");
		System.out.println("5- Borrar un Alumno:");
		System.out.println("8- Salir");

		System.out.println();
	}

	public static void modifyStudent() {
		int j = searchStudent();
		if (j == -1) {
			return;
		} else {
			System.out.println("Introduce el nuevo nombre");
			alumnos[j] = teclado.nextLine();
			System.out.println("Alumno modificado");

		}
	}

	public static void deleteStudent() {
		int j = searchStudent();
		if (j == -1) {
			return;
		} else {
			alumnos[j] = null;
			System.out.println("Alumno borrado");
		}
	}

	public static void addStudent() {

		if (i < alumnos.length) {
			System.out.println("Introduce el nombre del alumno:");
			alumnos[i] = teclado.nextLine();
			i++;
		} else {
			System.out.println("No se pueden añadir más alumnos. Límite alcanzado.");
		}
	}

	public static int searchStudent() {
		String search = "";
		System.out.println("Introduzca un nombre :");
		search = teclado.nextLine();
		for (int j = 0; j < i; j++) {
			if (search.equals(alumnos[j])) {
                System.out.println("Alumno encontrado: " + alumnos[j]);
				return (j);
			}
		}
			System.out.println("Alumno no existe");
		return (-1);
	}

	public static void printStudent() {
		 if (i == 0) {
	            System.out.println("No hay alumnos registrados.");
	            return;
	        }
	        System.out.println("Lista de Alumnos:");
	        for (int j = 0; j < i; j++) {
	            System.out.println(alumnos[j]);
	        }
	}

	public static void init_student() {

		boolean start = true;
		int numero = 0;

		while (start) {
			ShowMenu();
			numero = teclado.nextInt();
			teclado.nextLine();

			switch (numero) {
			case 1:
				addStudent();
				break;
			case 2:
				printStudent();
				break;
			case 3:
				searchStudent();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 8 : 
					System.out.println("Saliendo");
					start = false;
					break;
			 default:
                 System.out.println("Opción no válida. Por favor, elige nuevamente.");
                 break;
			}
		}
	}

	public static void main(String[] args) {

		init_student();
		teclado.close();

	}
}
