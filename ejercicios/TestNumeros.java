public class TestNumeros {

	public static void main(String[] args){
	
		Numeros.imprimirNumero1Al10();
		System.out.println("--------------------------");
		Numeros.imprimirSerie5();
		System.out.println("--------------------------");
		Numeros.imprimirSerie2();
		System.out.println("--------------------------");
		int numero = 11;
		int valorSuma = Numeros.sumar1aN(numero);
		System.out.printf("El valor de la suma de 1 a %d vale %d%n", numero, valorSuma);
		int valorSumaCuadrados = Numeros.sumar1aN2(numero);
		System.out.printf("El valor de la suma de los cuadrados de 1 a %d vale %d%n", numero, valorSumaCuadrados);
		Numeros.imprimirSumaParesEImpares(numero);	
		
	}
}
