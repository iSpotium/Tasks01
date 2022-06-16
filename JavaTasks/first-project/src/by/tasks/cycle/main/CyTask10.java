package by.tasks.cycle.main;

public class CyTask10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i = 1;
		double sum = 1;

		while (i <= 200) {
			sum = sum * (i * i);
			i++;
		}
		System.out.println("sum= " + sum);
	}

}
