package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int x, y;

		sc = new Scanner(System.in);

		System.out.print("x>");
		x = sc.nextInt();

		System.out.print("y>");
		y = sc.nextInt();

		if ((x > 0) && (y > 0)) {
			System.out.println("1 square");
		} else if ((x > 0) && (y < 0)) {
			System.out.println("2 square");
		} else if ((x < 0) && (y < 0)) {
			System.out.println("3 square");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("4 square");
		} else {
			System.out.println("zero coordinate");
		}

	}
}
