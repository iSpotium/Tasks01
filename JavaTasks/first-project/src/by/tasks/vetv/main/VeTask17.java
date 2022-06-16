package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int m, n;

		int R;
		int notR;

		sc = new Scanner(System.in);

		System.out.print("m>");
		m = sc.nextInt();

		System.out.print("n>");
		n = sc.nextInt();

		if (m != n) {
			if (m > n) {
				notR = m;
				System.out.println("m & n = " + notR);
			} else if (m < n) {
				notR = n;
				System.out.println("m & n = " + notR);
			}
		} else if (m == n) {
			R = 0;
			System.out.println("m & n = " + R);
		}

	}
}
