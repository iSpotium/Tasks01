package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;

		double a;
		double b;
		double c;
		double x;

		double sum;

		sc = new Scanner(System.in);

		System.out.print("a>");
		a = sc.nextDouble();

		System.out.print("b>");
		b = sc.nextDouble();

		System.out.print("c>");
		c = sc.nextDouble();

		System.out.print("x>");
		x = sc.nextDouble();

		sum = (a * x * x) + (b * x);

		if (sum > 0) {
			System.out.println("sum= " + sum);
		} else if (sum < 0) {
			System.out.println("sum= " + Math.abs(sum));
		}

	}
}
