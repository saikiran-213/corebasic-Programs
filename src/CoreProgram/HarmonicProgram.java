package CoreProgram;

import java.util.Scanner;

public class HarmonicProgram {

	/*
	 * To Print the Nth Harmonic Value.
	 */
	static double harmonic(int n) {
		double h = 1;
		for (double i = 2; i <= n; i++) {
			h = h + 1 / i;
		}
		return h;
	}

	/*
	 * main method to test the class
	 */
	public static void main(String[] ars) {
		Scanner s = new Scanner(System.in);
		/*
		 * try and catch to not terminate at wrong input
		 */
		try {
			System.out.println("enter harmonic number to find");
			int n = s.nextInt();
			System.out.println(harmonic(n));

		} catch (Exception e) {
			System.out.println("enter integer");
			main(ars);
		}
		s.close();
	}
}
