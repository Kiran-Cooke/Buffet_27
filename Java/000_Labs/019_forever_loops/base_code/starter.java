/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		System.out.println("would you like to start?");
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		
		while(A.equals("yes")){
		int B = (int)(1 + Math.random() * 1000);
		System.out.println(B);
		}		
	}
}
