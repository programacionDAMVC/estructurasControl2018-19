public class EstructuraSwitch1 {
	public static void main(String[] args){
		//controlamos que existan al menos 2 argumentos
		if (args.length < 2) { 
			System.out.println("Faltan argumentos");
			return; //sale del método donde se encuentra, en este caso el main
		}

		String dia = args[0]; //argumento 0
		int intervaloDias = Integer.parseInt(args[1]) ; //argumento 1
		int valorDia;

		switch (dia) {

			case "lunes" :
				valorDia = 1;
				break;
			case "martes" :
				valorDia = 2;
				break;
			case "miercoles" :
				valorDia = 3;
				break;
			case "jueves" :
				valorDia = 4;
				break;
			case "viernes" :
				valorDia = 5;
				break;
			case "sabado" :
				valorDia = 6;
				break;
			case "domingo" :
				valorDia = 0;
				break;
			default :
				valorDia = -1;
				break;
				
		}
		
		System.out.println("Al día " + dia + " le corresponde " + valorDia);
		if (valorDia >= 0){ 
			System.out.println("Dentro de " + intervaloDias + " le corresponde " +
			       	( ( intervaloDias + valorDia ) % 7 ));
		}

	}
}
