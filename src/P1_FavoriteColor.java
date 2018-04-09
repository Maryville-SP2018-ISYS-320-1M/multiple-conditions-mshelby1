import java.util.Scanner;

/*
ISYS 320
Name(s): Matthew Shelby
Date: 4/8/2018
*/

/*  What was the error?
 I thought the problem was that the statement was missing the else portion of the if/else statement,
 however that did not solve the problem.
 */

public class P1_FavoriteColor {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("What is your favorite color? ");
		String name = console.next();
	
		if( name == "blue") {
			System.out.println("Mine too!");
		} else {
			System.out.println("That's cool, mine is blue");
		}
	}
}
