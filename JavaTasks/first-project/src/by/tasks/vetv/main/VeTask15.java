package by.tasks.vetv.main;

public class VeTask15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		int y = 7;
		
		int sumH;
		int sum2x;
		
		sumH = x + y / 2;
		sum2x = (x * y) * 2;
		
		if (x > y) {
			System.out.println("x = " + sum2x + "\t y = " + sumH);
		} else if ( x < y ) {
			System.out.println("x = " + sumH + "\t y = " + sum2x);
		}else {
			System.out.println("x is cannot be equal to y");
		}
		
	}

}
