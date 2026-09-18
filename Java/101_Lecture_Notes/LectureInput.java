/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!

        double Chip = 2.99;
        double Suger = 2.99;
        double Rasin = 2.59;

        System.out.println("Welcome to Cooke's Cookie shop");
        System.out.println();
        System.out.println("1. Chocolate Chip Cookie - $"+Chip);
        System.out.println();
        System.out.println("2. Suger Cookie - $"+Suger);
        System.out.println();
        System.out.println("3. Rasin Cookie - $"+Rasin);

        System.out.println();
        System.out.println("How many Chocolate Chip Cookies would you like");
        Scanner cc = new Scanner(System.in);
        int CCamount = cc.nextInt();
        double CCtotal = Chip * CCamount;

        System.out.println();
        System.out.println("How many Suger Cookies would you like");
        Scanner sc = new Scanner(System.in);
        int SCamount = sc.nextInt();
        double SCtotal = Suger * SCamount;

        System.out.println();
        System.out.println("How many Rasin Cookies would you like");
        Scanner rc = new Scanner(System.in);
        int RCamount = rc.nextInt();
        double RCtotal = Rasin * RCamount;
    
        System.out.println();
        System.out.println("The Chocolate chip cookie's cost $" + CCtotal );

        System.out.println();
        System.out.println("The Suger cookie's cost $" + SCtotal );

        System.out.println();
        System.out.println("The Rasin cookie's cost $" + RCtotal );

        System.out.println();
        double subtotal = CCtotal+SCtotal+RCtotal;
        System.out.println("Your subtotal is $"+subtotal);
        
        System.out.println();
        System.out.println("how much would you like to tip? (in %)");
        Scanner tp = new Scanner(System.in);
        int TPamount = tp.nextInt();
        double TPtotal = (subtotal * (TPamount/100.0));

        double Total = subtotal + TPtotal;

        System.out.println();
        System.out.println("Subtotal $"+subtotal);

        System.out.println();
        System.out.println("Tip $"+TPtotal);
        
        System.out.println();
        System.out.println("Total $"+ Total);
	} 
}
