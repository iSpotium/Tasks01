package by.tasks.lin.main;

public class LinTask19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int st1 = 8;
		double St;
		double h;
		double r;
		double R;
		
		St = (Math.pow(st1, 2) * Math.sqrt(3)) / 4;
		h = Math.sqrt(Math.pow(st1, 2) - (Math.pow(st1, 2) / 4)); 
		r = st1 / (2 * Math.sqrt(3));
		R = st1 / Math.sqrt(3);
		System.out.println("h = " + h + "\t St = " + St + "\t r= " + r + "\t R= " + R);
	}

}
