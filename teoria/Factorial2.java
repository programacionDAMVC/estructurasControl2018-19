/**
 * Clase Factorial2, que calcula el
 * factorial de un número entero
 * @author Manuel M.
 * @version 1.0
 */

public class Factorial2 {

	/**
	 * Método que calcula el valor factorial
	 * de un número entero usando un bucle while
	 * @param numero valor a calcular factorial
	 * @return factorial del número de tipo long
	 */

	public static long calcularFactorial(int numero) {
		
		int contador    = 1;
		long acumulador = 1;
		while (contador <= numero){
			acumulador *= contador;
			contador++;
		}
		return acumulador;
	}

	/**
	 * Método que calcula el valor factorial
	 * de un número entero usando bucle for
	 * @param numero valor a calcular factorial
	 * @return factorial del número de tipo long
	 */
	public static long calcularFactorial1(int numero) {

		long factorial = 1;
		for (int i = 2 ; i <= numero ; i++ ) {
			factorial = factorial * i;
		}
		return factorial;

	}
	
}
