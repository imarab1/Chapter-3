import java.util.*; //for Scanner
public class excersizethreetwentyone //Class
{
	public static void main(String[] args)//Main method that prints our called method
	{
		Scanner keyboard = new Scanner(System.in);// allows for reading from console window

		processName(keyboard);//calls method and prints
	}

	public static void processName(Scanner console) { //Method we call
		System.out.print("Please enter your full name: "); //Prints statement
		String firstName = console.next(); //Stores first name
		String lastName = console.next(); //Stores last name
		System.out.print("Your name in reverse order is " + lastName + ", " + firstName);//Prints last name then first name
	}
}
