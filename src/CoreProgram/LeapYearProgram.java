package CoreProgram;

import java.util.Scanner;

public class LeapYearProgram {

	
		/*
		 * To check if year is leap year or not
		 */
		static boolean isLeap(int year) {
			return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		}
	     /*
	      * Main function
	      */
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter year in 4 digit");
			int year = s.nextInt();
			
			/*
			 * Ensures the value is 4 digit
			 */
			while (year < 999 || year > 9999) {
				System.out.println("wrong input");
				System.out.println("enter year in 4 digit");
				year = s.nextInt();
			}
			if (isLeap(year)) {
				System.out.println(year + " is a leap year");
			} else
				System.out.println(year + " is not a leap year");
			s.close();
		}
	}
