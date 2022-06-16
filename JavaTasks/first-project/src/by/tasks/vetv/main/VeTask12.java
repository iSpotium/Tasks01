package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;

		int ch1;
		int ch2;
		int ch3;

		sc = new Scanner(System.in);

		System.out.print("ch1>");
		ch1 = sc.nextInt();

		System.out.print("ch2>");
		ch2 = sc.nextInt();

		System.out.print("ch3>");
		ch3 = sc.nextInt();

		if (ch1 > 0) {
			System.out.println("ch1= " + (int)Math.pow(ch1, 2));
		}
		if (ch1 < 0) {
			System.out.println("ch1= " + (int)Math.pow(ch1, 4));
		} else if (ch1 == 0) {
			System.out.println("ch1 chislo ravno nuly");
		}
		if (ch2 > 0) {
			System.out.println("ch2= " + (int)Math.pow(ch2, 2));
		}
		if (ch2 < 0) {
			System.out.println("ch2= " + (int)Math.pow(ch2, 4));
		} else if (ch2 == 0) {
			System.out.println("ch2 chislo ravno nuly");
		}
		if (ch3 > 0) {
			System.out.println("ch3= " + (int)Math.pow(ch3, 2));
		}
		if (ch3 < 0) {
			System.out.println("ch3= " + (int)Math.pow(ch3, 4));
		} else if (ch3 == 0) {
			System.out.println("ch3 chislo ravno nuly");
		}
	}
}
