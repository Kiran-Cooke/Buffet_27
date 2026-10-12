/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		int k = 0;

		Scanner A = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = A.nextLine();

		System.out.println("what is your title");
		String title = A.nextLine();

		System.out.println("What class do you want to be");
		System.out.println("1. Wizard");
		System.out.println("2. Warrior");
		System.out.println("3. Rouge");

		String role = A.nextLine();


		if(role.equals("Wizard") || role.equals("wizard")){
			System.out.println("your now a wizard");
		}

		else if(role.equals("Warrior") || role.equals("warrior")){
			System.out.println("your now a warrior");
		}

		else if(role.equals("Rouge") || role.equals("rouge")){
			System.out.println("your now a rouge");
		}

		else{
			System.out.println("thats not a class");
			System.out.println("please input a valid class");
			role = A.nextLine();
		}
			
		System.out.println("You hava 20 points to spend on your stats, with a max of 10 per stat");
		
		System.out.println("what is your Strength (0-10)");
		int strength = A.nextInt();

		if(!((strength <= 10) && (strength >= 0))){
			System.out.println("You cant use that may points");
			System.out.println("please give a valid value");

			System.out.println("what is your Strength (0-10)");
			strength = A.nextInt();
		}
			int stat1 = (20 - strength);
			if((stat1 >= 0) && (stat1 <= 20)){
			System.out.println(stat1 + " points remaining");
			}
			if(!((stat1 >=0) && (stat1 <= 20))){
				System.out.println("You cant use that may points");
				System.out.println("please give a valid value");

				System.out.println("what is your Strength (0-10)");
				strength = A.nextInt();

				stat1 = (20 - strength);
				if((stat1 >= 0) && (stat1 <= 20)){
				System.out.println(stat1 + " points remaining");
			}
			}
			System.out.println("what is your Dexterity (0-10)");
			int dexterity = A.nextInt();

			if(!((dexterity <= 10) && (dexterity >= 0))){
				System.out.println("You cant use that may points");
				System.out.println("please give a valid value");

				System.out.println("what is your Dexterity (0-10)");
				dexterity = A.nextInt();

			}

				int stat2 = (stat1 - dexterity);
				if((stat2 >= 0) && (stat2 <= stat1)){
						    System.out.println(stat2 + " points remaining");
				}
				if(!((stat2 >=0) && (stat2 <= stat1))){
					System.out.println("You cant use that may points");
					System.out.println("please give a valid value");

					System.out.println("what is your Dexterity (0-10)");
					dexterity = A.nextInt();

					stat2 = (stat1 - dexterity);
					if((stat2 >= 0) && (stat2 <= stat1)){
					System.out.println(stat2 + " points remaining");
					}

				}

				System.out.println("what is your Intelligence (0-10)");
				int intelligence = A.nextInt();

					if(!((intelligence <= 10) && (intelligence >= 0))){
						System.out.println("You cant use that may points");
						System.out.println("please give a valid value");

						System.out.println("what is your Intelligence (0-10)");
						intelligence = A.nextInt();
					}

					int stat3 = (stat2 - intelligence);
					if((stat3 >= 0) && (stat3 <= stat2)){
					System.out.println(stat3 + " points remaining");
					}

					if(!((stat3 >=0) && (stat3 <= stat2))){
						System.out.println("You cant use that may points");
						System.out.println("please give a valid value");

						System.out.println("what is your Intelligence (0-10)");
						intelligence = A.nextInt();

						stat3 = (stat2 - intelligence);
						if((stat3 >= 0) && (stat3 <= stat2)){
						System.out.println(stat3 + " points remaining");
						}
						
					}

					System.out.println("what is your Charisma (0-10)");
					int charisma = A.nextInt();

					if(!((charisma <= 10) && (charisma >= 0))){
						System.out.println("You cant use that may points");
						System.out.println("please give a valid value");

						System.out.println("what is your Charisma (0-10)");
						charisma = A.nextInt();
					}

						int stat4 = (stat3 - intelligence);
						if((stat4 >= 0) && (stat4 <= stat3)){
						System.out.println(stat4 + " points remaining");
						}

						if(!((stat4 >=0) && (stat4 <= stat3))){
							System.out.println("You cant use that may points");
							System.out.println("please give a valid value");

							System.out.println("what is your Charisma (0-10)");
							charisma = A.nextInt();

							stat4 = (stat3 - intelligence);
							if((stat4 >= 0) && (stat4 <= stat3)){
						    System.out.println(stat4 + " points remaining");
						}
						}		

						System.out.println("your name is " + name);
						System.out.println("your title is " + title);
						System.out.println("your class is " + role);
						System.out.println("your strength is " + strength);
						System.out.println("your dexterity is " + dexterity);
						System.out.println("your intelligence is " + intelligence);
						System.out.println("your carisma is " + charisma);
		
	}
}					

        