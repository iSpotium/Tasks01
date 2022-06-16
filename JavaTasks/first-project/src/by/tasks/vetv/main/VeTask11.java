package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;

		double a1, a2;
		double b1, b2;
		double c1, c2;
		double Hp1, Hp2;
		double s1, s2;

		sc = new Scanner(System.in);

		System.out.print("a1>");
		a1 = sc.nextDouble();

		System.out.print("b1>");
		b1 = sc.nextDouble();

		System.out.print("c1>");
		c1 = sc.nextDouble();

		System.out.print("a2>");
		a2 = sc.nextDouble();

		System.out.print("b2>");
		b2 = sc.nextDouble();

		System.out.print("c2>");
		c2 = sc.nextDouble();

		Hp1 = (a1 + b2 + c2) / 2;
		Hp2 = (a2 + b2 + c2) / 2;

		s1 = Math.sqrt((((Hp1 * (Hp1 - a1)) * (Hp1 - b1)) * (Hp1 - c1)));
		s2 = Math.sqrt((((Hp2 * (Hp2 - a2)) * (Hp2 - b2)) * (Hp2 - c2)));

		if (s1 > s2) {
			System.out.println("The first triangle area is larger.");
		} else if (s1 == s2) {
			System.out.println("The area of the triangle is the same.");
		} else {
			System.out.println("Second triangle area is larger.");
		}
	}
}
