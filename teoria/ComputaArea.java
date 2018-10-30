//programa que calcula área
//pero comprueba previamente
//el valor del radio
//solo computa radios positivos
//
public class ComputaArea{
	public static void main(String[] args){
		
		int radio = 555;
		//si es negativo, no calculamos áres, mostramos mensaje
		if ( radio > 0 ) {
			double area = Math.PI *  Math.pow(radio, 2);
			System.out.println("El área del circulo de radio " 
					+ radio + " vale " + area);
		} else {
			System.out.println("No calculo áreas de radio no positivas");
		}

	}
}
