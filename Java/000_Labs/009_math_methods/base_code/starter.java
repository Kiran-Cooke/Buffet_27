/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		int m = Math.max(13 - 6 * 11, 30 % 7 * (-2));
		System.out.println("1)" + m);

		double s = Math.sqrt(13 * 8 + 31 % 7);
		System.out.println("2)" + s);

		double p = Math.pow(37 / 3, 35 % 21);
		System.out.println("3)" + p);

		double a = Math.max(Math.pow( 2,14%3) , Math.sqrt ( 2*6));
		System.out.println("4)" + a);

		//Extra Code
		System.out.println();
		System.out.println("Extra Examples");

		System.out.println();
		System.out.println("Please give your first double");
		Scanner X = new Scanner(System.in);
		double x = X.nextDouble();

		System.out.println();
		System.out.println("Please give your next double");
		Scanner Y = new Scanner(System.in);
		double y = Y.nextDouble();

		System.out.println();
		double extramax = Math.max(x,y);
		System.out.println("The Max of the two doubles is " + extramax);

		System.out.println();
		double extrasqrt = Math.sqrt(y);
		System.out.println("The square root of " + y +" is " + extrasqrt);

		System.out.println();
		double extrapow = Math.pow(x,y);
		System.out.println(x + " to the power of " + y + " is " + extrapow);
	}
}
