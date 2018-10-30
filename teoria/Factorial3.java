public class Factorial3 {

	public static long calcularFactorial(int numero) {
		if (numero == 0) {
			return 1;
		}
		else {
			return numero * calcularFactorial(numero -1);
		}
	}

}
