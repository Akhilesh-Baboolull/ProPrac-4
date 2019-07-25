/**
 * 
 * @author Akhilesh
 * 
 * Version 1.0
 * 
 */

import java.util.Scanner; //import package for user input
import java.text.DecimalFormat; //import package to round off


public class Qu_speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat("####.##");
		
		double distance; //variable for distance
		double time; //variable for time
		double speed; //variable for speed
		int choice;
		
		do {
		
		System.out.println("Calculation Of Speed"); //title
		System.out.println("");
		
		do {
		
		System.out.print("Enter Distance travelled in metres: ");
		distance = myInput.nextDouble();
		
		if (distance <= 0) { //Validation of distance
			System.out.print("Invalid Distance entered! Please Re-Enter.");
		}
		
		}while(distance <= 0);
		
		do {
		System.out.print("Enter Time Taken in hours: ");
		time = myInput.nextDouble();
		
		if (time <= 0) { //validation of time
			System.out.print("Invalid Time entered! Please Re-Enter.");
		}
		
		}while(time <= 0);
			
		speed = distance / time; //calculation of speed
		
		System.out.println("The speed is " + df2.format(speed) + " m/h."); //printing the result of speed
		
		do {
			//menu if user wants to re-try the program
		System.out.println("Choose 1 to continue");
		System.out.println("Choose 2 to Exit");
		
		System.out.print("Enter choice: ");
		choice = myInput.nextInt(); //entering choice
		
		if(choice != 1 && choice != 2) { //validating choice
			
			System.out.println("Invalid Choice entered! Please Re-Enter..."); //validation of choice
		}
		
		}while(choice != 1 && choice != 2); //allowing user to re-enter choice
		
		}while(choice == 1); //Allowing user to re-try program
		
		
		myInput.close();
	}

}
