/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner A = new Scanner(System.in);
		
		System.out.println("what is your name");
		String name = A.nextLine();
		
		System.out.println("how many times would you like it repeated?");
		int reps = A.nextInt();

		int x = 1;

		while(true){
			System.out.println(name);
			if (x == reps){
				break;
			}
			x=x+1;
		}
	}
}
