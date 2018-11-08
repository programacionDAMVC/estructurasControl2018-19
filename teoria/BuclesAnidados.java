public class BuclesAnidados {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j+=2){
				for (int k = 0; k < 10; k+=3) {
					System.out.println(i + "--" + j + "--" + k);
				}
			}
		}
	}
}
