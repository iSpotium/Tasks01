package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;

		int x;
		int y;

		sc = new Scanner(System.in);

		System.out.print("x>");
		x = sc.nextInt();

		System.out.print("y>");
		y = sc.nextInt();

		if (x > y) {
			System.out.println("Chislo x bolshe chisla y");
		} else if (x == y) {
			System.out.println("Chisla x and y ravni");
		} else {
			System.out.println("Chislo y bolshe chisla x");
		}
		
	}
}
