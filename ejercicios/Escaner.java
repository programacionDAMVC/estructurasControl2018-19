import java.util.Scanner;

public class Escaner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número entero");
		int numero = sc.nextInt();
		System.out.printf("El número entero leido es %d%n", numero);
		System.out.println("Dame una palabra");
		String palabra = sc.next();
		System.out.printf("Palabra leida %s%n", palabra);
		System.out.println("Dame un nº real");
		double numeroReal = sc.nextDouble();
                System.out.printf("El número real leido es %.3f%n", numeroReal);
		System.out.println("Dame tres nº enteros:"); //separador espacio en blanco
		int numero1 = sc.nextInt();                  //o salto de línea
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		System.out.printf("Números enteros leidos es %d--%d--%d%n", numero1, numero2,numero3);

		//vamos a estar leyendo valores de nº enteros hasta que aparezca un nº negativo
		System.out.println("Vamos a sumar números:");
		System.out.println("Para acabar introduce un número negativo:");
		int suma = 0;
		int valorLeido  = 0;
		int contadorPares = 0;
		while (true) {
			valorLeido = sc.nextInt();
			if (valorLeido < 0)
				break;
			if (valorLeido % 2 == 0)
				contadorPares++;
			suma += valorLeido;
		}
		System.out.printf("El valor de la suma de los nº leídos vale %d%n", suma);
		System.out.printf("Nº de pares leídos %d%n", contadorPares);

		sc.close(); //cierro el scanner, no lo voy a seguir usando
		//continuación de código
		Numeros.imprimirSumaParesEImpares(numero);



	}
}

	
