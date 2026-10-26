/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("would you like to start (Yes/No)");
		String Start = sc.nextLine();

		int money = 100;
		int bet = 0;

		while((Start.equals("Yes")) || (Start.equals("yes")) || (Start.equals("y"))){

			System.out.println("your balance is " + money);

			System.out.println("how much would you like to bet?");
			bet = sc.nextInt();

			money = money - bet;

			int slot1 = (int)(1+Math.random()*10);
			int slot2 = (int)(1+Math.random()*10);
			int slot3 = (int)(1+Math.random()*10);

			System.out.print("|" + slot1 + "|");
			System.out.print("|" + slot2 + "|");
			System.out.print("|" + slot3 + "|");
			System.out.println("");

			if ((slot1 == slot2) && (slot1 == slot3)){
				money = ((bet * 3) + money);
			}
			else if(slot1 == slot2){
				money = ((bet * 2) + money);
			}
			else if(slot2 == slot3){
				money = ((bet * 2) + money);
			}
			else if(slot3 == slot1){
				money = ((bet * 2) + money);
			}

			if(money <= 0){
				break;
			}
			while((Start.equals("No")) || (Start.equals("no")) || (Start.equals("n"))){
				System.println
		}
	}
}
