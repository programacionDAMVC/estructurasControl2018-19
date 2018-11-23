import java.util.Scanner;

//aquí iría los comentarios de javadoc

public class TresCifras {
	public static void main(String[] args){
		
		//leemos la entrada como una cadena (String) con Scanner y next()
		System.out.println("Introduce un nº de tres cifras");
		Scanner sc = new Scanner(System.in);
		String numeroTresCifras = sc.next();
		if ( numeroTresCifras.length() != 3 ) {
			System.out.println("No tiene tres caracteres");
			return;  //se sale del método que lo contiene, en este caso main, por lo que acaba el programa
		}
		//System.out.println("leido número: " + numeroTresCifras);
		char centena = numeroTresCifras.charAt(0);
		char decena = numeroTresCifras.charAt(1);
		char unidad = numeroTresCifras.charAt(2);
		if (Character.isDigit(centena) && Character.isDigit(decena) 
				&& Character.isDigit(unidad)) {
			System.out.printf("La centena es %c, la decena es %c y la unidad es %c%n", centena, decena, unidad);
				}
		else 
			System.out.println("No es un número");


		//otra forma de hacerlo es leer la entrada como entero con nexInt()
		//no se puede controlar que venga algo que no sea un número
		System.out.println("***********************************************");
		System.out.println("Introduce otro número");
		int numeroLeido = sc.nextInt();
		sc.close();
		//System.out.println("Nº introducido " + numeroLeido);
		if (numeroLeido < 100 || numeroLeido > 999) {

			System.out.println(numeroLeido + " no tiene tres cifras");

		} else {

			int primeraCifra = numeroLeido / 100;
			int segundaCifra = ( numeroLeido % 100 ) / 10;
			int terceraCifra = ( numeroLeido % 100 ) % 10;
			System.out.printf("La centena es %d, la decena es %d y la unidad es %d%n", primeraCifra, segundaCifra, terceraCifra);

		}
		


	}
}
