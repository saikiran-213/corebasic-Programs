package CoreProgram;

import java.util.Scanner;



public class FactorProgram {
	/*
	 * To check if the number is prime or not
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/*
	 * To find the prime factors of given number and print it
	 */
	static void primeFactors(int n) {
		for (int i = 2; i <= n; i++) {
			int t = n % i;
			if (t == 0) {
				if (isPrime(i))
					System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no to find prime factors");
		int n = s.nextInt();
		System.out.println("prime factors are ");
		primeFactors(n);
		 System.out.println(isPrime(n));
		s.close();

	}
}