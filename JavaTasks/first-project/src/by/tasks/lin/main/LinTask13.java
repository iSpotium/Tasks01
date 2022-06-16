package by.tasks.lin.main;

public class LinTask13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 4;
		int x2 = -9;
		int x3 = 15;
		int y1 = -4;
		int y2 = 5;
		int y3 = -2;
		
		double rasX1_X2;
		double rasX1_X3;
		double rasX2_X3;
		
		double P;
		double p;
		double S;
		
		rasX1_X2 = Math.sqrt((Math.pow(x2, 2) - Math.pow(x1, 2)) + ((Math.pow(y2, 2) - Math.pow(y1, 2))));
		rasX1_X3 = Math.sqrt((Math.pow(x3, 2) - Math.pow(x1, 2)) + ((Math.pow(y3, 2) - Math.pow(y1, 2))));
		rasX2_X3 = Math.sqrt((Math.pow(x3, 2) - Math.pow(x2, 2)) + ((Math.pow(y3, 2) - Math.pow(y2, 2))));
		System.out.println("rasX1_X2= " + rasX1_X2 + "\t rasX1_X3= " + rasX1_X3 + "\t rasX2_X3= " + rasX2_X3);
		
		P = rasX1_X2 + rasX1_X3 + rasX2_X3;
		p = (rasX1_X2 + rasX1_X3 + rasX2_X3) / 2;
		S = Math.sqrt(p * (p - rasX1_X2) * (p - rasX1_X3) * (p - rasX2_X3));
		System.out.println("p = " + p + "\t P= " + P + "\t S = " + S);
	}
}
