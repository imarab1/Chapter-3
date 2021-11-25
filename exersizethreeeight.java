public class exersizethreeeight {
	public static void main(String[] args){
		quadratic(1, -7, 12);//Gives us example numbers, adds parameters to the method
		quadratic(1, 3, 2);//Gives us example numbers, adds parameters to the method
	}
	public static void quadratic(int a, int b, int c) {//method with place holder parameters
		double row1 = (-1 * b + Math.sqrt(b * b - 4 * a * c))/ (2 * a);//caluclates quadratic function
		double row2 = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);//caluclates quadratic function
		System.out.println("x = " + row1 + ", x = " + row2);//prints quadratic function
	}
}
