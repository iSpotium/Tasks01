package by.tasks.lin.main;

import java.util.Scanner;

public class LinTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc;
		double katet1;
		double katet2;
		double gip;
		double s;
		double p;

		sc = new Scanner(System.in);

		System.out.print("katet1>");
		katet1 = sc.nextDouble();

		System.out.print("katet2>");
		katet2 = sc.nextDouble();

		s = (katet1 * katet2) / 2;
		gip = Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2));
		p = katet1 + katet2 + gip;

		System.out.println("s= " + s + "\t gip= " + gip + "\t p= " + p);

	}

}
