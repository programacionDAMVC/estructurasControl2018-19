public class Factorial1 {
	public static void main(String[] args){
		
		int numero     = 2;
		int contador   = 1;
		long acumulador = 1;

		if (numero < 0 ) {

			System.out.println("No existen los factoriales de número negativos");
			System.exit(1);

		}


		while ( contador <= numero  ) {
			//acumulador *= contador
			acumulador = acumulador * contador;
			contador++;

		}

		System.out.println("Factorial de " + numero + " vale " + acumulador);
	}
}

