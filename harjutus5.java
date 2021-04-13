package Harjutused;
import java.util.Scanner;
public class harjutus5 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("sisesta esimine nr: ");
		float a = input.nextInt();
		System.out.print("sisesta teine nr: ");
		float b = input.nextInt();
		if (a>0 && b>0) {
			double d = (a/b);
			System.out.println();
			System.out.println("Tulemus: " +d);
			
		}
		else {
			System.out.println("sisestatud arvu ei saa arvutada");
			
		
		}
		
		
	  }

}
