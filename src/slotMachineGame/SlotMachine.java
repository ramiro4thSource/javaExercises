package slotMachineGame;

import java.util.Random;

/**
 * This class represent a "Las Vegas" slot machine
 * */
public class SlotMachine {
	
	/**
	 * Static string array with default values for this machine
	 * */
	public static final String[] values = { "Cherry", "Apple", "Seven", "Church", "Car", "House", "Bus", "Man", "Woman",
			"Plane", "Monkey", "Tree", "World", "Money", "Computer", "Bed" };
	/**
	 * Represent the value state of credits 
	 * */
	private boolean credit = false;
	
	/**
	 * String array where result will be stored
	 * */
	private String[] result = new String[3];

	
	/**
	 * Unique constructor which set initial value for result array 
	 * initial values are "Start, Start, Start"
	 * */
	public SlotMachine() {		
		for (int i = 0; i < result.length; i++) {
			result[i] = "Start";
		}
	}

	/**
	 * raffle method set random values for string array result. The values are taken from {@link #values values array}
	 * @return string array with results
	 * */
	public String[] raffle() {		
		if (getCredit()) {
			Random random = new Random();
			for (int i = 0; i < result.length; i++) {
				result[i] = values[random.nextInt(values.length)];
			}
			setCredit(false);
		}
		return result;
	}

	/**
	 * Given a string array as parameter this method check if there is matches from all values
	 * @param valuesToCheck String array to be checked 
	 * @return true if all members has same value
	 * */
	public static boolean checkResult(String[] valuesToCheck) {
		String aux=valuesToCheck[valuesToCheck.length-1];
		for(int i=(valuesToCheck.length-1);i>=0;i--) {
			if(aux!=valuesToCheck[i])return false;
			aux=valuesToCheck[i];
		}
		return true;
	}

	/**
	 * @return String result array. Remember string array length is 3.
	 * */
	public String[] getResult() {
		return this.result;
	}
	
	/**
	 * Force  {@link #result result array } values 
	 * @param Result string array with values
	 * */
	public void setResult(String[] Result) {
		if(Result.length==this.result.length) {
			this.result=Result;
		}
		else throw new ArrayIndexOutOfBoundsException("String array passed has different length from inner string array");
	}

	/**
	 * Get current machine slot credit state
	 * @return current credit state
	 * */
	public boolean getCredit() {
		return this.credit;
	}

	/**
	 * Set current machine slot credit state
	 * @param Credit state to be set
	 * */
	public void setCredit(boolean Credit) {
		this.credit = Credit;
	}

}
