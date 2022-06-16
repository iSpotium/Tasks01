package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;

		int x = 3;
		int a;

		sc = new Scanner(System.in);

		System.out.print("a>");
		a = sc.nextInt();

		if (a < x) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}
}
