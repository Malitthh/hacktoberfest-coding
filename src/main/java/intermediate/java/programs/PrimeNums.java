package interview.questions;

public class PrimeNums {

	public static void main(String[] args) {
		int n = 20;
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println(i + " " + isPrime(i));
		}

	}

	static boolean isPrime(int n) {

		// 1 is neither prime nor composite
		if (n <= 1) {
			return false;
		}
		
		int c = 2;
		
		while ( c * c <= n) {
			 if (n % c == 0) {
				 
				 return false;
			 }
			 c++;
		}
		return true;

	}

}
