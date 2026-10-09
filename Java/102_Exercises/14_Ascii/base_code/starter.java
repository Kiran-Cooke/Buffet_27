/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		System.out.println("Welcome to my art exibit, What would you like to see");
		System.out.println("1. Space:");
		System.out.println("2. Games:");
		System.out.println("3. Food:");

		Scanner In = new Scanner(System.in);
		String input = In.nextLine();

		if(input.equals("Space") || input.equals("1")){

			System.out.println("--Space--");
			System.out.println("what would you like to see in the exibit?");
			System.out.println("1. Earth");
			System.out.println("2. Alien" );

			Scanner Inspace = new Scanner(System.in);
			String inputspace = In.nextLine();

				if(inputspace.equals("Earth") || input.equals("1")){
					System.out.println("            _____");
					System.out.println("         .-'.  ':'-.");
					System.out.println("       .''::: .:    '.");
					System.out.println("      /   :::::'      \\");
					System.out.println("     ;.    ':' `       ;");
					System.out.println("     |       '..       |");
					System.out.println("     ; '      ::::.    ;");
					System.out.println("      \\       '::::   /");
					System.out.println("       '.      :::  .'");
					System.out.println("         '-.___'_.-'");
			}	

				else if(inputspace.equals("Alien") || input.equals("2")){
					System.out.println("	            ____");
					System.out.println("	     _,-ddd888888bbb-._");
					System.out.println("	   d88888888888888888888b");
					System.out.println("	 d888888888888888888888888b");
					System.out.println("	6888888888888888888888888889");
					System.out.println("	68888b888q8888888p8888d88889");
					System.out.println("	 d8887     p88888q     4888b");
					System.out.println("	  d8887    p88888q    4888b");
					System.out.println("	   d8887   p88888q   4888b");
					System.out.println("	     d88bod8888888dob88b");
					System.out.println("	       d888888888888d");
					System.out.println(" 	        d8888888888b");
					System.out.println(" 	         d88888888b ");
					System.out.println(" 	           b8888d");

			}	

				else{
					System.out.println("That is not one of the peices");
			}	

		}	

		else if(input.equals("Games") || input.equals("2")){

			System.out.println("--Games--");
			System.out.println("what would you like to see in the exibit?");
			System.out.println("1. Mario");
			System.out.println("2. Bulbasaur" );

			Scanner Ingames = new Scanner(System.in);
			String inputgames = In.nextLine();

				if(inputgames.equals("Mario") || input.equals("1")){
					System.out.println(" 				************");
					System.out.println("               ####....#.");
					System.out.println("            #..###.....##....");
					System.out.println("            ###.......######");
					System.out.println("                ...........");
					System.out.println("              ##*#######");
					System.out.println("           ####*******######");
					System.out.println("          ...#***.****.*###....");
					System.out.println("          ....**********##..... ");
					System.out.println("          ....****    *****....");
					System.out.println("            ####        ####");
					System.out.println("          ######        ######");
			}	

				else if(inputgames.equals("Bulbasaur") || input.equals("2")){
					System.out.println(" 	                   .    .");
					System.out.println(" 	                    /V/");
					System.out.println("  	           _..__. /     ");
					System.out.println(" 	        .        .      \\");
					System.out.println("  	    *-_/_.-*  .-*    \\  \\");
					System.out.println("	  /         \\        \\  \\");
					System.out.println("     //       /            )   \\");
					System.out.println("	| /(      /(   |*-.    /    )");
					System.out.println("	| |_|.  .|_| |   *-./    /");
					System.out.println("	|.____________.|      *-. /");
					System.out.println("	|  *.      .*  |         *.");
					System.out.println("	*-._ *.__.* _.-*           )");
					System.out.println("	   |*-.__.-*              |");
					System.out.println("	   |           /     /    |");
					System.out.println("	   \\    *-.   |   | |    |");
					System.out.println("	    \\     |*-.|   )(     /");
					System.out.println("	     \\,,,/   /,,,/ \\,,,/");
			}	

				else{
					System.out.println("That is not one of the peices");
			}	
		}	

		else if(input.equals("Food") || input.equals("3")){

			System.out.println("--Food--");
			System.out.println("what would you like to see in the exibit?");
			System.out.println("1. Sushi");
			System.out.println("2. Pizza" );

			Scanner Infood = new Scanner(System.in);
			String inputfood = In.nextLine();

				if(inputfood.equals("Sushi") || input.equals("1")){
					System.out.println("        ,;'''''''';,");
					System.out.println("      ,iiiiiiiiiiiiii,"); 
					System.out.println("      iii          iii");   
					System.out.println("       `.________.`");
			}	

				else if(inputfood.equals("pizza") || input.equals("2")){
					System.out.println("    // --.._");
 					System.out.println("");
					System.out.println("   ||  (_)  _ -._");
 					System.out.println("");
 					System.out.println("   ||    _ (_)    '-.");
					System.out.println("");
 					System.out.println("   ||   (_)   __..-'");
 					System.out.println("");
 					System.out.println("    \\__..--");

			}	

				else{
					System.out.println("That is not one of the peices");
			}	
		}	

		else{
			System.out.println("we dont have that exibit here");
		}	
	}
}


	
