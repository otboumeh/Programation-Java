package ud1;
import java.util.Scanner;

public class Ejer19EnteroReal {


	    public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        System.out.print("Ingresa un número real: ");
	        double numeroReal = teclado.nextDouble();
	        int parteEntera = (int) numeroReal;
	        double parteDecimal = numeroReal - parteEntera;
	        System.out.println("Parte entera: " + parteEntera);
	        System.out.println("Parte decimal: " + parteDecimal);       
	        teclado.close();
	    }
	}

