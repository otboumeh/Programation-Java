package ejercicio2;

/**
 * Crea un programa en Eclipse con el siguiente código. Ejecútalo línea por línea para ver qué valor tiene 
 * la variable 'a' en cada iteración del bucle y tras salir de él.
 */
public class Debug {

	public static void main(String[] args) {

		int a=10, b=2;
		for (a=2; a<=300 && b<20; a*=b){
		    a++;
		}
	
		System.out.println ("Fin - a= " + a + " y b= " + b);
	}
}