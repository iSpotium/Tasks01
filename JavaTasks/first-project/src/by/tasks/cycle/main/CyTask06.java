package by.tasks.cycle.main;

import java.util.Scanner;

public class CyTask06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		
		int x = 1;
		int i;
		int sum = 0;
		
		sc = new Scanner(System.in);

		System.out.print("i>");
		i = sc.nextInt();
		
		while (x < i) {
			System.out.print(x + " ");
			sum = sum + x;
			x = x + 1;
		}
		System.out.println("\nsum= " + sum);
	}

}
