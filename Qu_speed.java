/**
 * 
 * @author Akhilesh
 * 
 * Version 1.0
 * 
 */

import java.util.Scanner; //
import java.text.DecimalFormat;


public class Qu_speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat("####.##");
		
		double distance;
		double time;
		double speed;
		int choice;
		
		do {
		
		System.out.println("Calculation Of Speed");
		System.out.println("");
		
		System.out.print("Enter Distance travelled in metres: ");
		distance = myInput.nextDouble();
		
		System.out.print("Enter Time Taken in hours: ");
		time = myInput.nextDouble();
		
		speed = distance / time;
		
		System.out.println("The speed is " + df2.format(speed) + " m/h.");
		
		do {
			
		System.out.println("Choose 1 to continue");
		System.out.println("Choose 2 to Exit");
		
		System.out.print("Enter choice: ");
		choice = myInput.nextInt();
		
		if(choice != 1 && choice != 2) {
			
			System.out.println("Invalid Choice entered! Please Re-Enter...");
		}
		
		}while(choice != 1 && choice != 2);
		
		}while(choice == 1);
		
		
		myInput.close();
	}

}
