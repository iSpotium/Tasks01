package by.tasks.lin.main;

public class LinTask17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -6;
		int b = -9;
		
		double SAK;
		double SG;

		
		SAK = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		SG = Math.pow(Math.sqrt(Math.abs(a) * Math.abs(b)), 2);
		System.out.println("SAK = " + SAK + "\t SG= " + SG);
	}

}
