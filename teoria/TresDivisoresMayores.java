public class TresDivisoresMayores {
	public static void main(String[] args){
	     int numero =10_000_000;
	     int contador = 0;
	     //recorre un bucle e imprimir desde 77,76,75 ... 0
	     System.out.println("Los tres posibles divisores mayores de " + numero);
	     for (int i = numero / 2  ; i > 1; i-- ){ //no buscamos el propio número ni el 1 (obvio)
		     if (numero % i == 0) { //si resto de la división es cero
			System.out.print(i + " "); //es divisor
			contador++;
		     }
		     if (contador == 3){
			break;
		     }
	     }
	     System.out.println("\nEncontrados " + contador + " divisores");
	}
}
