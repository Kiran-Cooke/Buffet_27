/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("What class do you want to be");
		System.out.println("1. Wizard");
		System.out.println("2. Warrior");
		System.out.println("3. Rouge");

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		if(input.equals("Wizard") || input.equals("wizard")){
			System.out.println("your now a wizard");
		}

		else if(input.equals("Warrior") || input.equals("warrior")){
			System.out.println("your now a warrior");
		}

		else if(input.equals("Rouge") || input.equals("rouge")){
			System.out.println("your now a rouge");
		}

		else{
			System.out.println("thats not a class");
			
		}
	}
}
