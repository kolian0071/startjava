public class Cycle {
	public static void main(String[] args) {
		int numWhile = 6;
		int numDoWhile = 10;
		int sum = 0;

		for(int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		while(numWhile >= -6) {
			System.out.print(numWhile + " ");
			numWhile = numWhile - 2;
		}
		System.out.println();

		do{
			if(numDoWhile%2 !=0) {
				sum = sum + numDoWhile;
			}
			numDoWhile++;
		}
		while(numDoWhile <= 20);
		System.out.println(sum);
	}
}