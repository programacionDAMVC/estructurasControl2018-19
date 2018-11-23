public class Hora {
	public static void main(String[] args){

		if (args.length < 3) {
			System.out.println("Faltan argumentos");
			System.exit(1);
		}

		String hora     = args[0];
		int iHora       = Integer.parseInt(hora); //convierte la cadena (String) a int
		String minutos  = args[1];
		int iMinutos    = Integer.parseInt(minutos); //ya se puede operar como número entero
		String segundos = args[2];
		int iSegundos   = Integer.parseInt(segundos); //idem
		System.out.printf("Leido %s:%s:%s%n", hora, minutos, segundos);

		if (iHora >= 0 && iHora < 24 && iMinutos >= 0 && iMinutos < 60
				&& iSegundos >= 0 && iSegundos < 60)
		       System.out.println("Hora válida");
		else
		       System.out.println("Hora no válida");

	}
}
