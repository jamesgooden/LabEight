import java.util.Arrays;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       int userInput;

//String [] Thestudents = studentArray() ;
//System.out.println(Arrays.toString(Thestudents));
//get some info on classmates
// create arrays of info 
//array 1 = names} 
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
		
	   System.out.println( "Welcome to our Java class. Which student would you like to know more about? ");
		for (int i = 0; i < stuNames.length; i++) {
			System.out.println((i + 1) + ". " + stuNames[i]);
			}
     
 


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






// array 3 = favorite food

//String[] food = { "Pasta ", "Cake", "Salmon", };
//	System.out.println("Welcome to my app");
//	/give user a list to choose from
	System.out.println("\n Pick a student: ");
for (int i = 0; i < stuNames.length; i++) {
	System.out.println((i + 1) + ". " + stuNames[i]);
	}
	int userOption = scan.nextInt();
////match the number a user selects to a students info
////// show food match for selection
//
//
//
}
}
////	
//	public static int getIntValid(Scanner scan, String prompt) {
//		int i = 0;
//		boolean isValid = false;
//	while (isValid == false) {
//		System.out.print(prompt);
//			if (scan.hasNextInt()) {
//			i = scan.nextInt();
//			isValid = true;
//		} else {
//			System.out.println("Error! Invalid integer value. Try again.");
//		}
//		scan.nextLine(); // discard any other data entered on the line
//	}
//	return i;
//}
//
//public static int getInt1(Scanner sc, String prompt, int min, int max) {
//	int i = 0;
//	boolean isValid = false;
//	while (isValid == false) {
//		i = getIntValid(sc, prompt);
//		if (i < min)
//			System.out.println("Error! Number must be " + 1 + " or greater.");
//		else if (i > max)
//			System.out.println("Error! Number must be " + 20 + " or less.");
//		else
//		isValid = true;
//	}
//	return i;
//}
//
//}
//
//}
//}
//
////
////	public static void  ()  {
////		
////		String [] names = {  "Dejuan", "Anthony " , "Weird Al" , "Brian" };
////		 int [] studentNum = {14 , 21 , 69 , 15};
////		 
////		 for (int i = 0; i < studentNum.length ; i ++)    {
////			 
////			 System.out.println("Player Name: " +names[i] + " Jersey #: " + studentNum[i]);
////			 
////			 
////		 }
////			
//
////	public static String getString(Scanner sc, String prompt) {
////		System.out.print(prompt);
////		String s = sc.next(); // read user entry
////		sc.nextLine(); // discard any other data entered on the line
////		return s;
////	}
////
////	public static String studentVerification (Scanner scan, String prompt, String regex) {
////		boolean isValid = false;
////		String input;
////
////		do {
////			input = getString(scan, prompt); // this is calling the getString() method above 
////			if (input.matches(regex)) {
////				isValid = true;
////			} else {
////				System.out.println(" That student doesn't exist. Please try again. (enter a number 1-20) ");
////				isValid = false;
////			}
////		} while (!isValid);
////
////		return input += " Is a valid entry! thank you";
////	}
////String[] students = { " David " , "Sam " , "Steven" , "Tiffany" , "Will" , " Blake " , "Ashley"};
////students[0] = "David favorite food is Spaghetti";
//
////	return students;
