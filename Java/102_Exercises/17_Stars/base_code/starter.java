/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the Width"); 
		int width = sc.nextInt();

		System.out.println("What is the Hight"); 
		int hight = sc.nextInt();

		int a = 0;
		int b = 0;
		String wide = new String("");

		System.out.println("");
		while(b != hight){
				while(a != width){
				wide = new String(wide + "*");
				a++;
				if(a == width){
				break;
				}
			}

			System.out.println(wide);
			b++;
			if(b == hight){
				break;
			}
		}

		System.out.println("__________________________________________________");
		System.out.println("");

		System.out.println("how far do you want to go"); 
		int star = sc.nextInt();

		int a1 = 0;
		int b1 = 0;
		String widestar = new String("");

		System.out.println("");
		while(b1 != star){
				while(a1 != star){
					System.out.print(widestar +"*");
				
				if(a1 == star){
				break;
				}
				System.out.println("");
				widestar = widestar + "*";
				a1++;
			}
			b1++;
			if(b1 == star){
				break;
			}
		}
	}
}
