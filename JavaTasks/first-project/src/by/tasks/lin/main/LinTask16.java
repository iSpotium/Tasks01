package by.tasks.lin.main;

public class LinTask16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int C = 1567;
		int c1;
		int c2;
		int c3;
		int c4;
		
		int sum;
		
		c1 = C / 1000;
		c2 = C % 1000/ 100;
		c3 = C % 100 / 10;
		c4 = C % 10;
		
		sum = c1 * c2 * c3 * c4;
		System.out.println("c1= " + c1 + "\t c2= " + c2 + "\t c3= " + c3 + "\t c4= " + c4);
		System.out.println("sum= " + sum);
	}

}
