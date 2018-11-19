
public class Escaner1 {
	public static void main(String[] args){

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Introduce una frase:");
		String linea = sc.nextLine();
		System.out.printf("Línea leída en mayúscula %S%n", linea);
		System.out.println("Introduce una serie de números");

		int acumulador = 0;
		int numeroLeido = 0;

		while ( sc.hasNextInt() ){
			numeroLeido = sc.nextInt();
			acumulador += numeroLeido;
		}
		System.out.printf("El valor del acumulador es %d%n", acumulador);

	}
}
