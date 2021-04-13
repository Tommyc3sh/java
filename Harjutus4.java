//Christopher Robin Kaasik
package Harjutused;
import java.util.Scanner;

public class Harjutus4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Sisesta tekst siia: ");
		String nimi = scanner.nextLine();
		System.out.println(nimi.toUpperCase());
		System.out.println(nimi.length());
		String[] tykeldus = nimi.split(" ");
		System.out.println(tykeldus.length);
		System.out.printf("esimene sõna on %s", tykeldus[0]);
}
}