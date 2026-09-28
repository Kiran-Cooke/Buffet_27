/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
        //main color//

        int r1 = (int)(Math.random()*256);
        int g1 = (int)(Math.random()*256);
        int b1 = (int)(Math.random()*256);

        System.out.println("Primary:");
        getColor(r1, g1, b1);
        System.out.println("");

        //Complementary//

        int r2 = (255 - r1);
        int g2 = (255 - g1);
        int b2 = (255 - b1);

        System.out.println("Complementary:");
        getColor(r2, g2, b2);
        System.out.println("");

        //Triadic//

        int b3 = (r1);
        int r3 = (g1);
        int g3 = (b1);

        int g4 = (r1);
        int b4 = (g1);
        int r4 = (b1);

        System.out.println("Triadic:");
        System.out.println("RGB-");
        getColor(r1, g1, b1);
        System.out.println("BRG-");
        getColor(r3, g3, b3);
        System.out.println("GBR-");
        getColor(r4, g4, b4);
        System.out.println("");

        //Dark//

        int rd = (int)(Math.random()*128);
        int gd = (int)(Math.random()*128);
        int bd = (int)(Math.random()*128);

        System.out.println("Dark:");
        getColor(rd, gd, bd);
        System.out.println("");

        //Light

        int rl = (int)(128+Math.random()*128);
        int gl = (int)(128+Math.random()*128);
        int bl = (int)(128+Math.random()*128);

        System.out.println("Light:");
        getColor(rl, gl, bl);
        System.out.println("");
        
        //More Blue

        int rb = (int)(Math.random()*128);
        int gb = (int)(Math.random()*128);
        int bb = (int)(128+Math.random()*128);
        
        System.out.println("More Blue:");
        getColor(rb, gb, bb);
        System.out.println("");
		
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
