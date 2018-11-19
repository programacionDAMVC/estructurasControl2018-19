/** Clase que aporta métodos 
 * para la resolución de un sistema
 * de dos ecuaciones con dos incógnitas
 * con la estructura:
 * <br>  a · x + b · y = e
 * <br>  c · x + d · y = f
 * @author Manuel M.
 * @version 1.0
 */

public class SistemaEcuaciones2 {
	
	/**
	 * Método que nos dice si un sistema de dos ecuaciones con
	 * dos incógnitas se puede resolver
	 * @param a valor que acompaña a la x en la primera ecuación
	 * @param b valor que acompaña a la y en la primera ecuación
	 * @param c valor que acompaña a la x en la segunda ecuación
	 * @param d valor que acompaña a la y en la segunda ecuación
	 * <br><br>
	 * @return true si el sistema de ecuaciones se puede resolver con una solución única, caso
	 * contrario devuelve false
	 */
	public static boolean esResoluble(double a, double b, double c, double d){

		return a * d - b * c != 0;
	
	}

	/**
         * Método que nos devuelve el valor de x en la resolución del sistema de dos ecuaciones con
         * dos incógnitas 
         * @param a valor que acompaña a la x en la primera ecuación
         * @param b valor que acompaña a la y en la primera ecuación
         * @param c valor que acompaña a la x en la segunda ecuación
         * @param d valor que acompaña a la y en la segunda ecuación
         * @param e término independiente de la primera ecuación
         * @param f término independiente de la segunda ecuación
         * <br><br>
         * @return el valor de x del sistema de ecuaciones
         */

	public static double calcularX (double a, double b, double c, double d, double e, double f){

		return ( e * d - b * f ) / ( a * d - b * c );

	}

	/**
         * Método que nos devuelve el valor de y en la resolución del sistema de dos ecuaciones con
         * dos incógnitas
         * @param a valor que acompaña a la x en la primera ecuación
         * @param b valor que acompaña a la y en la primera ecuación
         * @param c valor que acompaña a la x en la segunda ecuación
         * @param d valor que acompaña a la y en la segundaa ecuación
         * @param e término independiente de la primera ecuación
         * @param f término independiente de la segunda ecuación
         * <br><br>
         * @return el valor de y del sistema de ecuaciones
         */

	public static double calcularY (double a, double b, double c, double d, double e, double f){

		return ( a * f - e * c ) / ( a * d - b * c );

	}

}
