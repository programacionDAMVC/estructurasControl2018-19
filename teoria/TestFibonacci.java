public class TestFibonacci {

	public static void main(String[] args){

		int n = 70;
		if (n < 0) {
			System.out.println("No se puede calcular fibonacci de nº negativos");
			System.exit(1);
		}

		long fibonacci1 = Fibonacci.getFibonacci(n, 0, 1);
		System.out.println("Valor del elemento " + n + " vale " + fibonacci1);
		long fibonacci2 = Fibonacci.calcularFibonacci(n);
		System.out.println("Valor del elemento " + n + " vale " + fibonacci2);

	}

}
