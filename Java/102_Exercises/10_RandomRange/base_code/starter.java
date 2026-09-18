import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		//input//
		System.out.println("Enter 2 integers to be your random number range");

		System.out.println("Enter your first integer");
		Scanner A = new Scanner(System.in);
		int a = A.nextInt();

		System.out.println("Enter your next integer (Larger then the first)");
		Scanner B = new Scanner(System.in);
		int b = B.nextInt();

		//output//
		System.out.println("Your range is " + a + " to " + b);

		int c = (int)(a + Math.random() * (b-a));
		int d = (int)(a + Math.random() * (b-a));
		int e = (int)(a + Math.random() * (b-a));
		int f = (int)(a + Math.random() * (b-a));
		int g = (int)(a + Math.random() * (b-a));
		System.out.println("Here are 5 random nubers within your range");
		System.out.println(c + ", " + d + ", " + e + ", " + f + "and, " + g);
	}
}
