package by.tasks.cycle.main;

public class CyTask07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -3;
		int b = 16;
		int h = 1;
		int i = a;
		int x = i;
		int res = 0;
		
		for (i = a; i <= b; i = i + h) {
			if (x <= 2) {
				res = -x;
			}else {
				res = x;
			}
		}System.out.println("res = " + res + " x = " + x);
		
	}

}
