public class exersizefive {
	public static void main(String[]args){
		printGrid(4, 6);//parametors
	}
	public static void printGrid(int row, int column){//Method with included parameters
		for(int i = 1; i <= row; i++){//Loop that sets the number of rows
			for(int j = i; j <= row * column; j += row){//Loop that sets the number of columns
				System.out.print(j);//prints numbers
				System.out.print(" ");// adds space
			}
		System.out.println(); // Allows the rows and columns to form - w/o this we would have a straight line
		}
	}
}
