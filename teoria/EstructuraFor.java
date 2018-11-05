public class EstructuraFor {
	public static void main(String[] args) {

		int numero = 5;
		int suma   = 0;

		for (int i = 0 ; i <= numero ; i++ ) {
			suma += i;
		}
		
		System.out.println("La suma de los " + numero + " primeros números vale " + suma);
	}
}

