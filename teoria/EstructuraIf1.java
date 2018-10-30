public class EstructuraIf1 {

	public static void main(String args[]){
		
		int numero = 9;
		//para números mayores que 9 y menores que 101
		if ( numero >= 10 && numero <= 100 ) {

			System.out.println( numero + " numero mayor o igual que 10 y menor o igual que 100" );
			if ( numero % 2 == 0 ) {
				System.out.println(numero + " es par");
			}

		}
		//para números mayores que 100
		else if ( numero > 100 ) {
			
			System.out.println( numero + " número mayor que 100" );
			if ( numero < 1000  ) {
				System.out.println( numero + " número menor que 1000" );
			}
			else {
				System.out.println( numero + " número mayor que 1000" );
			}

		}
		//para números menores que 10	
		else {
			
			System.out.println( numero +  "  número menor que 10" );

			if ( numero < 0 ) {
				System.out.println( numero +  "  número negativo" );
			}
			else {
				System.out.println( numero +  "  número positivo" );
			}

			if ( numero % 2 != 0 ) {
				System.out.println( numero +  "  número impar" );
				if ( numero % 3 == 0) {
					System.out.println( numero +  "  número divisible por 3" );
				}
			}



		}
		System.out.println( "Fuera del ámbito del if-else" );



	}

}
