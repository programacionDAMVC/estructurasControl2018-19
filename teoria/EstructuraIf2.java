public class EstructuraIf2 {

	public static void main(String args[]){
		
		int numero = 101;

		if ( numero >= 10 && numero <= 100 ) {
			System.out.println( numero + " numero mayor o igual que 10 y menor o igual que 100" );
			System.out.println("****************");
		}

		else if ( numero > 100 ) 
			System.out.println( numero + " número mayor que 100" );
			
		else {
			System.out.println( numero +  "  número menor que 10" );
			System.out.println(  "fin del else" );

		}

		
		System.out.println( "Fuera del ámbito del if-else" );



	}

}
