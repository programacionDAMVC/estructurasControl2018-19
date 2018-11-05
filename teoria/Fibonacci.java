public class Fibonacci {

	public static long calcularFibonacci (int numero) {
		//casos bases
		if (numero == 0) 
			return 0;
		if (numero == 1)
			return 1;
		//recursividad (se llama a la propia función)
		else 
			return calcularFibonacci (numero - 1) + calcularFibonacci (numero - 2); 
		
	}

	 public static long getFibonacci (int n, int x, int y) {
                if (n == 0) return x;
                if (n == 1) return y;
                else
                        return getFibonacci(n-1, y, x+y);
        }
}
