package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;

		int a;
		int b;

		sc = new Scanner(System.in);

		System.out.print("a>");
		a = sc.nextInt();

		System.out.print("b>");
		b = sc.nextInt();

		if (a > b) {
			System.out.println("Naimenshee chislo b");
		} else if (b > a) {
			System.out.println("Naimenshee chislo a");
		}

	}
}
