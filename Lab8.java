import java.util.Arrays;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       int userInput;




//array 1 = names
		String[] stuNames = new String[11];
		stuNames[0] = "Ashley";
		stuNames[1] = "George";
		stuNames[2] = "Steve";
		stuNames[3] = "Grace";
		stuNames[4] = "Jim";
		stuNames[5] = "Melissa";
		stuNames[6] = "Anthony";
		stuNames[7] = "Tyson";
		stuNames[8] = "Catherine";
		stuNames[9] = "Lindsay";
		stuNames[10] = "James";

			
     
 


//array 2 = hometown
	String[] studentHometown = new String[11];
 studentHometown[0] = " Ashley is from Detroit , MI ";
 studentHometown[1]= "George is from Bay City , MI";
 studentHometown[2] = "Steve is from Southfield , MI";
 studentHometown[3]= " Grace is from Detroit , MI";
 studentHometown[4]= " Jim is from Detroit , MI";
 studentHometown[5]= " Melissa is from Detroit , MI";
 studentHometown[6] = " Anthony  is from Bloomfied hills , Mi";
 studentHometown[7]= " Tyson is from Boca Raton , Florida";
 studentHometown[8] = " Catherine is from Flint , Michigan";
studentHometown[9] = " Lindsay is from Pontiac , Michigan";
studentHometown[10]= " James is from Detroit ,Mi ";




	}
	



	



	
	public static int getIntValid(Scanner scan, String prompt) {
	int i = 0;
		boolean isValid = false;
	while (isValid == false) {
		System.out.print(prompt);
		if (scan.hasNextInt()) {
		i = scan.nextInt();
		isValid = true;
	} else {
			System.out.println("Error! Invalid integer value. Try again.");
		}
	scan.nextLine(); // discard any other data entered on the line
}
return i;

	}
public static int getInt1(Scanner sc, String prompt, int min, int max) {
	int i = 0;
	boolean isValid = false;
	while (isValid == false) {
		i = getIntValid(sc, prompt);
		if (i < min)
			System.out.println("Error! Number must be " + 1 + " or greater.");
	else if (i > max)
		System.out.println("Error! Number must be " + 20 + " or less.");
	else
	isValid = true;
	}
	return i;

}

}
	