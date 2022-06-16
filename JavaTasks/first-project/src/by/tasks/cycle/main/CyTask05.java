package by.tasks.cycle.main;

public class CyTask05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int sum = 0;

		while (x <= 99) {
			sum = sum + x;
			x = x + 2;
		}
		System.out.println(x + " ");
		System.out.println("\nsum = " + sum);
	}

}
