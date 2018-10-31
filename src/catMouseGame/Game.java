package catMouseGame;

import catMouseGame.Cat;

import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;


/**
 * Game class contains game logic, therefore a main method is used here.
 * */
public class Game {
	/**
	 * Static "catgame" is needed, don't create another instance. New instance would create a new result so be careful!!
	 * */
	static Cat catGame = new Cat();
	
	/**
	 * Chances is a global variable which counts chances.
	 * */
	static int chances = 0;

	
	/**
	 * main method with user interaction and menu options. There is a main loop to keep interaction with user, 
	 * if user press "e" or all chances are used game will end.
	 * @param args command line arguments
	 * @throws IOException if any user exception input stream is generated
	 * */
	public static void main(String[] args) throws IOException {		
		
		
		// Initializing variables
		String answer;
		Scanner s;
		answer = null;
		s = new Scanner(System.in);

		// Printing menu
		printMainMenu();

		// Main cycle
		do {
			if (s.hasNext()) {
				answer = s.next();
			}

			switch (answer.toLowerCase()) {
			case "s":
				
				if (chances < 5) {
					System.out.println("Get the mouse!!");
					System.out.println("Insert coordenates (i.e \"3,4\") ");
					System.out.println("Max range [5,5]");
					if (s.hasNext()) {
						answer = s.next();
						if(tryOne(answer)) answer="e";
					}
				}
				else {
					answer="e";
					s.close();};
				break;
			case "e":
				System.out.println("Cya!!");
				s.close();
				answer="e";
				break;
			case "cheat":
				System.out.println("Shame on you!!!!");
				catGame.showResult();
				break;
			default:
				printMainMenu();
				break;
			}
		} while (answer != "e");
	}

	/**
	 * printMainMenu.... so confusing.... just created to print main menu!!!
	 * */
	public static void printMainMenu() {
		System.out.println("Please select one of the menu options");
		System.out.println("Action -------------- Key ");
		System.out.println(" Try ----------------  S");
		System.out.println(" Exit ---------------  E");
		System.out.println(" Cheat --------------  cheat");
	}

	/**
	 * tryOne Tries to find a mouse hidden using coordinates passed as string 
	 * @param input User input from keyboard
	 * @return true if mouse is caught
	 * */
	public static boolean tryOne(String input) {
		String regex = "\\d{1},+\\d";
		
		if (Pattern.matches(regex, input)) {
			String[] coordenates = { "", "" };
			coordenates = input.split(",");

			if (catGame.catchMouse(Integer.parseInt(coordenates[0]), Integer.parseInt(coordenates[1]))) {
				System.out.println("Congrats you did it!");
				catGame.showResult();
				return true;
			}
			else {
				chances++;
				System.out.println("Sorry try again!! Remaining opportunities: "+ (5-chances));
				};
		} else
			System.out.println("Sorry your input is wrong try again");
		printMainMenu();
		return false;
	}

}
