/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
		System.out.println("Please enter a number:");
        Scanner in = new Scanner(System.in);
		int inp = in.nextInt();

		System.out.print("here are the next 5 numbers:"+inp +", ");
		System.out.print(+(inp + 1)+", ");
		System.out.print(+(inp + 2)+", ");
		System.out.print(+(inp+ 3)+", ");
		System.out.print(+(inp + 4)+", ");
		System.out.println(+(inp + 5));

		System.out.print("here are the next 5 multiples:"+inp+", ");
        System.out.print(+(inp*2)+", ");
		System.out.print(+(inp*3)+", ");
		System.out.print(+(inp*4)+", ");
		System.out.print(+(inp*5)+", ");
		System.out.println(+(inp*6));

		System.out.println("here is the number divided by 100:"+(inp/100.0));

		System.out.println("here is the number divided by 10:"+(inp/10.0));
	}
}
