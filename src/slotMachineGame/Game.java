package slotMachineGame;
import java.util.Scanner;

import slotMachineGame.SlotMachine;

/**
 * Main class with user interaction. A main method is implemented here.
 * */
public class Game {
	static SlotMachine machine = new SlotMachine();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
											
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
				
				if (machine.getCredit()) {
					System.out.println("Good luck");
					String[] example = machine.raffle();
					//String[] example = machine.getResult();
					System.out.println(String.format("[ %s | %s | %s]", example[0],example[1],example[2]));
					if(SlotMachine.checkResult(example)) System.out.println(" Yeii you will be rich");
					else {
						System.out.println(" I'll be rich..I mean sorry for you :(");						
						}
					machine.setCredit(false);
					
				}
				else System.out.println("No credit please insert coin --------  C");
				break;
			case "e":
				System.out.println("Cya!!");
				s.close();
				answer="e";
				break;
			case "c":
				System.out.println("Coin inserted :D");
				machine.setCredit(true);
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
		System.out.println("Action                Key ");
		System.out.println("-------------------------");
		System.out.println(" Try ----------------  S");
		System.out.println(" Exit ---------------  E");
		if(!machine.getCredit())
		System.out.println(" Insert coin --------  C");
	}

}
