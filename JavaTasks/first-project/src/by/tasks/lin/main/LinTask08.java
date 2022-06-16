package by.tasks.lin.main;

public class LinTask08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 4;
		double b = 2;
		double c = 8;
		
		double sum;
		
		sum = (((b + Math.sqrt(Math.pow(b, 2) + ((4 * a) * c))) / (2 * a)) - ((Math.pow(a, 3) * c) + Math.pow(b, -2)));
		System.out.println("sum= " + sum);
	}

}
