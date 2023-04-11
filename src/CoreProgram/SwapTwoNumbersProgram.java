package CoreProgram;
import java.util.Scanner;
public class SwapTwoNumbersProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, n;
		/*
		 *  a and b are to swap   
		 */
	    Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter the value of X and Y");  
	    a = sc.nextInt();  
	    b = sc.nextInt();  
	    System.out.println("before swapping numbers: "+a +"  "+ b);  
	    /*
	     *  After Swapping
	     */
	    n = a;  
	    a = b;  
	    b = n;  
	    System.out.println("After swapping: "+a +"   " + b);  
	    System.out.println( );  
	 }    
	}  