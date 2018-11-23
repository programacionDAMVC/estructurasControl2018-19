import java.util.Scanner;



public class NombreLeido {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre con apellidos");
		String nombreLeido = sc.nextLine();
		sc.close();
		System.out.printf("Hola %s%n", nombreLeido);

	}
}
