/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/8/2018
*/
import java.util.Scanner;
public class P6_Quadrant {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		double x = console.nextDouble();
		double y = console.nextDouble();
		double quadrant = quadrant (x, y);
	}
	public static double quadrant(double x, double y) {
		if ((x > 0) && (y > 0)) {
			System.out.println("Quadrant I");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("Quadrant II");
		} else if ((x < 0) && (y < 0)) {
			System.out.println("Quadrant III");
		} else if ((x > 0) && (y > 0)) {
			System.out.println("Quadrant IV");
		}return 0;
	}
	
}
