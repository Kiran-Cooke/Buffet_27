/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		System.out.print("What is your name?"); 
		Scanner na = new Scanner(System.in);
		String name = na.nextLine();

		System.out.print("How old are you?"); 
		Scanner ag = new Scanner(System.in);
		int age = ag.nextInt();

		System.out.print("What is your birth month?"); 
		Scanner mon = new Scanner(System.in);
		String month = mon.nextLine();

		System.out.print("What is your birth day?"); 
		Scanner da = new Scanner(System.in);
		int day = da.nextInt();

		System.out.print("What is your Birth year?"); 
		Scanner ye = new Scanner(System.in);
		int year = ye.nextInt();

		System.out.print("How much is a buck fifty?"); 
		Scanner bu = new Scanner(System.in);
		double buck = bu.nextDouble();

		System.out.println("Your name is " + name);
		System.out.println("you are " + age + " years old");
		System.out.println("Your birth month is " + month);
		System.out.println("Your birth day is " + day);
		System.out.println("Your birth year is " + year);
		System.out.println("A buck fifty is $" + buck);
	}
}
