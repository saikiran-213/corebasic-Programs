package CoreProgram;

public class LargestThreeNumbersProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 25, num2 = 30, num3 = 40;

	    /*
	     * Check if num1 is greatest
	     */
	    if (num1 >= num2 && num1 >= num3)
	        System.out.println (num1 + " is the greatest");

	    /*
	     * Check if num2 is greatest
	     */
	    else if (num2 >= num1 && num2 >= num3)
	        System.out.println (num2 + " is the greatest");

	    /*
	     * Check if num3 is greatest
	     */
	    else if (num3 >= num1 && num3 >= num2)
	        System.out.println (num3 + " is the greatest");
	  }
}