package by.tasks.vetv.main;

import java.util.Scanner;

public class VeTask19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int a, b, c;
		int sum = 0;
		
		sc = new Scanner(System.in);

		System.out.print("a>");
		a = sc.nextInt();
		
		System.out.print("b>");
		b = sc.nextInt();
		
		System.out.print("c>");
		c = sc.nextInt();
		
		if (a > 0) {
			sum++; 
		}
		if (b > 0) {
			sum++;
		}
		if (c > 0) {
			sum++;
		}
		System.out.println("sum = " + sum);
	}

}
