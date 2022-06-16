package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;

		int t1;
		int t2;
		int y = 90;
		int max = 180;
		int min = 1;

		sc = new Scanner(System.in);

		System.out.print("t1>");
		t1 = sc.nextInt();

		System.out.print("t2>");
		t2 = sc.nextInt();

		if (t1 == y) {
			System.out.println("t1 rectangular triangle");
		} else if ((t1 > y) && (t1 < max)) {
			System.out.println("t1 triangle exists");
		} else if ((t1 < y) && (t1 >= min)) {
			System.out.println("t1 triangle exists");
		} else {
			System.out.println("t1 triangle does not exist");
		}
		if (t2 == y) {
			System.out.println("t2 rectangular triangle");
		} else if ((t2 > y) && (t2 < max)) {
			System.out.println("t2 triangle exists");
		} else if ((t2 < y) && (t2 >= min)) {
			System.out.println("t2 triangle exists");
		} else {
			System.out.println("t2 triangle does not exist");
		}
		
	}
}
