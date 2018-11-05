public class EstructuraDoWhile {
	public static void main(String[] args) {
		//El programa calcula la suma: 0 + 1 + 2 + 3 + 4 .... + 9 + 10
		int numero   = 5;  
		int contador = 0; 
		int suma     = 0;
		do {
			suma += contador;
			contador ++;
		} while (contador <= numero);
		System.out.println("La suma de los " + numero + " primeros números vale " + suma);
		System.out.println("Valor del contador " + contador);
	}
}
