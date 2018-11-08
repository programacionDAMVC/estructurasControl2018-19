public class EstructuraSwitch{
	public static void main(String[] args){
		
		//partimos del domingo donde dia es igual a 0
		int dias = 300;
		int dia = dias % 7;

		switch (dia) {
			
			case 0 :
				System.out.println("Es domingo");
				break;
			case 6 :
				System.out.println("Es sábado");
				break;
			default:
				System.out.println("Es laborable");
				break;

		}

	}
}
