/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 integers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a>b){
			if (a>c){
				System.out.println("Your greatest value is " + a);
			}
		}
		if (b>a){
			if (b>c){
				System.out.println("Your greatest value is " + b);
			}
		}
		if (c>a){
			if (c>b){
				System.out.println("Your greatest value is " + c);
			}
		}
		if (a<b){
			if (a<c){
				System.out.println("Your smallest value is " + a);
			}
		}
		if (b<a){
			if (b<c){
				System.out.println("Your smallest value is " + b);
			}
		}
		if (c<a){
			if (c<b){
				System.out.println("Your smallest value is " + c);
			}
		}
	}
}