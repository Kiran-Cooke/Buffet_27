/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
			int a = (int)(Math.random()*1001);
		Scanner B = new Scanner(System.in);
		System.out.println("input an int 0-1000:");
		System.out.println("You got it right, it was: " + a);
		int b = B.nextInt();
		if (a == b){
			System.out.println("You got it right, it was: " + a);
		}
		else if (a<b){
			System.out.println("Lower");
		}
		else if (a>b){
			System.out.println("Higher");
		}
	}
}
