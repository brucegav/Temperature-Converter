/**
 * Bruce Gavins
 * MSI-5030
 * Assignment 2.3
 */

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program asks the user for an a temperature in Fahrenheit (within the range of -459 to 212).
 * Then displays a table of of 20 temperature values in Fahrenheit and their Celsius equivalents,
 * with each pair incrementing by 10 degrees Fahrenheit.
 */

public class TemperatureConverter {

    public static void main(String[] args) {

	//Create a scanner object to take user input
	Scanner input = new Scanner(System.in);

	// Defining temperature range parameters
	final int MIN_TEMP = -459; //Absolute zero in F
	final int MAX_TEMP = 212;  //Boiling point of water in F
	final int INCREMENT = 10;  // temperature increment amount
	final int NUM_PAIRS = 20;  // number of temperature pairs to create

	int fahrenheit; //declaring Fahrenheit variable
	boolean validInput = false; // used in loop to check if user input valid or not

	/**
	 * do-while loop that checks user input value
	 * if the user input is invalid, it returns a request to enter valid input within the range
	 * if user input is valid, it moves to next process
	 */
	do {
	    System.out.print("Enter a Fahrenheit temperature between -459 and 212 degrees: ");
	    fahrenheit = input.nextInt();

	    if (fahrenheit >= MIN_TEMP && fahrenheit <= MAX_TEMP) {
		validInput = true;
	    } else {
		System.out.println("Invalid temperature.  Please enter a value between -459 and 212 degrees: ");
	    }
	} while (!validInput); // if input is within range, exit loop

	// Creates DecimalFormat object to limit decimal places to 2
	DecimalFormat df = new DecimalFormat("0.00");

	//Prints header for the temperature table
	System.out.println("\nFahrenheit\tCelsius");
	System.out.println("----------\t-------");

	//Prints table of 20 pairs of temperatures
	for (int i = 0; i < NUM_PAIRS; i++) { //initialized at 0, when less than 20 continue, increment by 1
	    //Calculate Celsius temperature using formula C=(F-32) * 5/9
	    double celsius = (fahrenheit -32) * 5.0/9.0;

	    //Print fahrenheit and celsius temps separated by a tab (\t)
            System.out.println(fahrenheit + "\t\t" + df.format(celsius));

	    //Increment Fahrenheit temperature by 10 degrees
	    fahrenheit += INCREMENT;

         }


	//Close scanner utility
	input.close();

    }

}

	
	
	

	

	
