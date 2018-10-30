public class TestFactorial {

	public static void main(String[] args){
		
		int numero = 35;
		
		if (numero >= 0) {
			long factorial1 = Factorial2.calcularFactorial(numero);

			System.out.println("El factorial de " + numero + " vale " + factorial1);
			long factorial2 = Factorial3.calcularFactorial(6);
			System.out.println("El factorial de 6  vale " + factorial2);
		}
		else 
			System.out.println("No existen factoriales de números negativos");

	}
}
