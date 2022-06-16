package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;

		double r1;
		double s1;

		double pi = 3.14;

		double r2;
		double s2;

		sc = new Scanner(System.in);

		System.out.print("r1>");
		r1 = sc.nextDouble();

		System.out.print("r2>");
		r2 = sc.nextDouble();

		s1 = pi * Math.pow(r1, 2);
		s2 = pi * Math.pow(r2, 2);

		if (s1 > s2) {
			System.out.println("The area of​​ the first circle is larger");
		} else if (s1 == s2) {
			System.out.println("The area of the circles is the same");
		} else {
			System.out.println("The area of​​ the second circle is larger");
		}
	}
}
