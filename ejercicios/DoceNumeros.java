import java.util.Scanner;

public class DoceNumeros {
	public static void main (String[] args) {

		System.out.println("Introduce doce nº reales, y para acabar pulsa FIN");
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		while (sc.hasNextFloat()){
			float numero = sc.nextFloat();
			System.out.printf("%10.2f",numero);
			contador++;
			if (contador % 4 == 0)
				System.out.println();
		}

	}
}
