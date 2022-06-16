package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;

		int a;
		int b;
		int c;

		sc = new Scanner(System.in);

		System.out.print("a>");
		a = sc.nextInt();

		System.out.print("b>");
		b = sc.nextInt();

		System.out.print("c>");
		c = sc.nextInt();

		if ((a == b) && (b == c)) {
			System.out.println("Triangle is equilateral");
		} else {
			System.out.println("Triangle is not equilateral");
		}
	}
}
