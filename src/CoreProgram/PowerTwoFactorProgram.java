package CoreProgram;

import java.util.Scanner;


public class PowerTwoFactorProgram {

	/*
	 *  To  print a table of the powers of 2 that are less than or equal to 2^N.
	 */
	static void printTable(int Power) {
		int val = 1;
		for (int i = 1; i <= Power; i++) {
			val = val * 2;
			System.out.println(val);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter to find power of 2 less than 32");
		int Power = s.nextInt();
		while (Power > 31) {
			System.out.println("invalid input ");
			System.out.println("enter value less than 32");
			Power = s.nextInt();
		}
		printTable(Power);
		s.close();
	}
}