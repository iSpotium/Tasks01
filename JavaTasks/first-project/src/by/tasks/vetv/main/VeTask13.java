package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int x1, y1;
		int x2, y2;

		sc = new Scanner(System.in);

		System.out.print("x1>");
		x1 = sc.nextInt();

		System.out.print("y1>");
		y1 = sc.nextInt();

		System.out.print("x2>");
		x2 = sc.nextInt();

		System.out.print("y2>");
		y2 = sc.nextInt();

		if (Math.sqrt(x1 * x1 + y1 * y1) < Math.sqrt(x2 * x2 + y2 * y2)) {
			System.out.println("coordinate 1 closer");
		} else if (Math.sqrt(x1 * x1 + y1 * y1) < Math.sqrt(x2 * x2 + y2 * y2)) {
			System.out.println("coordinate 2 closer");
		} else {
			System.out.println("coordinates are equivalent");
		}

	}
}
