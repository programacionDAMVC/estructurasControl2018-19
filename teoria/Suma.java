public class Suma {
	public static void main(String[] args) {

		int numero   = 4;
		int contador = 0;
		int suma     = 0;

		while ( contador <= numero ){
			suma += contador;  // suma = suma + contador;
			System.out.println("Valor del contador en el bucle: " + contador++);
		}
		System.out.println("Valor del número:   " + numero);
		System.out.println("Valor del contador: " + contador);
		System.out.println("Valor de la suma:   " + suma);

	}
}
