public class EstructuraWhile1 {
	public static void main(String[] args){

		int numero = 7;
		while (  (numero <= 100) || (numero % 2 == 0)  ) {

			System.out.println("Dentro del while");
			System.out.println(numero);
			numero += 20;
			
		}

		System.out.println("Valor de numero: " + numero);


 	}	
}
