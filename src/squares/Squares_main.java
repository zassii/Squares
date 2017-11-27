package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = { 1.2, 1.5, 2.5, 2.7, 7.8, 8.2};
		double y[] = { -9.0, 0.0, 2.4, 5.6, 5.7, 15.0};
		//double x[] = { 2.0, 5.0, 6.0, 7.5, 8.3, 9.7, 13.5};
		//double y[] = { 4.0, 10.0, 12.0, 15.0, 16.6, 19.4, 27.0};
		//double x[] = { 0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2 };
		//double y[] = { 1.0, 1.9, 3.2, 4.3, 4.8, 6.1, 7.2 };
		double theta[] = new double[2];
		
		Squares_lib slib = new Squares_lib(x,y);
		
		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getObject());
		}
	}

}