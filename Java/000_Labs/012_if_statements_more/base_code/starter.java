/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		System.out.println("Input two Intgers");
		System.out.println("");

		System.out.println("Give your first Int:");
		Scanner A = new Scanner(System.in);
		int a = A.nextInt();
		System.out.println("");

		System.out.println("Give your next Int:");
		Scanner B = new Scanner(System.in);
		int b = B.nextInt();
		System.out.println("");

		boolean yes = a==b;
		boolean no = a!=b;

		if(yes){
			System.out.println(a + " = " + b);
		}

		if(no){
			System.out.println(a + " does not equal " + b);
		}


	}
}
