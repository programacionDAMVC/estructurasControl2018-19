public class Numeros {

	public static void imprimirNumero1Al10(){

		for ( int i = 1 ; i <= 10 ; i++ ) {

			//System.out.println(i);
			System.out.printf( "%6d" , i ); //dejamos 6 espacios

			if ( i % 3 == 0 ) { //imprimimos a tres columnas
				System.out.println();
			}

		}
		System.out.println();
		
	}

	public static void imprimirSerie5(){

		for ( int i = 20 ; i <= 80 ; i += 5 ) {

			//System.out.println(i);
			System.out.printf( "%6d" , i );

			if ( i % 3 == 0 ) { 
				System.out.println();
			}

		}
		System.out.println();
	}

	public static void imprimirSerie2(){

		for ( int i = 100 ; i >= 50 ; i = i - 2 ) { //similar i -= 2

			//System.out.println(i);
			System.out.printf( "%6d" , i );

			if ( i % 3 == 0 ) {
				System.out.println();
			}

		}
		System.out.println();
	}

	public static int sumar1aN(int n) {

		int contador = 1;
		int suma     = 0;

		while (contador <= n){
			suma += contador;
			contador++;
		//	System.out.println(n + "<=" + contador);
		}
		
		return suma;

	}
	public static int sumar1aN2(int n) {

		int contador = 1;
		int sumaCuadrados     = 0;

		while (contador <= n){
			sumaCuadrados += contador * contador; //Math.pow(contador,2)
			contador++;
		//	System.out.println(n + "<=" + contador);
		}
		
		return sumaCuadrados;

	}
	
	public static void imprimirSumaParesEImpares(int n) {
		
		int contador    = 1;
		int sumaPares   = 0;
		int sumaImpares = 0;

		do { 

			if ( contador % 2 == 0) {
				sumaPares += contador;
			}
			else {
				sumaImpares += contador;
			}

			contador++;

		} while (contador <= n);

		//System.out.println("La suma de los pares del 1 al " + n + " vale " + sumaPares + 
		//		" y la de los impares vale " + sumaImpares); 
		System.out.printf("La suma de los pares del 1 al %d vale %d y la de los impares vale %d%n",n,sumaPares, sumaImpares); 
	}






}
