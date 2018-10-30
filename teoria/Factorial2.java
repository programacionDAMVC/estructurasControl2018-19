/**
 * Clase Factorial2, que calcula el
 * factorial de un número entero
 * @author Manuel M.
 * @version 1.0
 */

public class Factorial2 {

	/**
	 * Método que calcula el valor factorial
	 * de un número entero
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
	
}
