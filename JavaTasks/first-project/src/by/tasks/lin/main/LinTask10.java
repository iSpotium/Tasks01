package by.tasks.lin.main;

public class LinTask10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 8;
		double y = 12;
		
		double sum;
		
		sum = (((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * (Math.tan(x) * Math.tan(y)));
		System.out.println("sum = " + sum);
		
	}
}
