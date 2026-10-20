/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		int a = (int)(Math.random()*1001);
		System.out.println("what is your guess");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();

		while(true){
			if(a == b){
			System.out.println("you got it right");
			break;
			}

			boolean c = a > b;
			boolean d = a < b;

			if(c){
				System.out.println("higher");

			}

			if(d){
				System.out.println("lower");
			}
			System.out.println("please guess again");
			b = sc.nextInt();

			a = a;
		}
	}
}
