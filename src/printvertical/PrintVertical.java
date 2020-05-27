package printvertical;

import java.util.Scanner;

public class PrintVertical {
	
	
	/*
	 This method (vertical) processes the input entered by the user.
	 
	 */
	private static void vertical(String userInput) {
	
		//check the length of the entered string and assign to a variable
		int strLength = userInput.length();
		
		
		/*
		 Using for loop. Print all the characters as long as the position is
		 less than the string length. If the index(position) of the character 
		 is greater or equal to the input string length, then the condition
		 becomes false hence the execution stops. 
		 */
		for(int i = 0; i < strLength; i++){
			
			//check the position of each character
			char letter = userInput.charAt(i);
			/*print out the character. System.out.println prints in the next line hence
			 the string will be printed vertically.
			 */
			    System.out.println(letter);
			
			}

			
	     }

	//the main function
	public static void main(String[]args) {
		
		//Creating the Scanner object
		Scanner scan = new Scanner(System.in);
		//Display a prompt to user
		System.out.print("Please enter a sentence :");
		
		/*get the user input and store to a variable. scan.nextLine() will take the user input until
		  they press the enter key
		*/
		String userInput = scan.nextLine();
		System.out.print("Your sentence printed vertically is :\n");
		
		//call the vertical() function and pass the user input.
		vertical(userInput);
	
		//close the Scanner
		scan.close();
	}
}
