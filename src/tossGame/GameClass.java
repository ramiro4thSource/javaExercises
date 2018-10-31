package tossGame;

/**
 * Represents a toss game
 * */
public class GameClass {
	private int head;
	private int tails;
	private int toss;
	
	/**
	 * Initialize fields with 0 value
	 * */
	public GameClass() {
		this.head=0;
		this.tails=0;
		this.toss=0;
	}
	
	/**
	 * Initialize fields with values passed as function parameters
	 * @param Head initial value for head field
	 * @param Tails initial value for tail field
	 * @param Toss initial value for toss field
	 * */
	public GameClass(int Head, int Tails, int Toss) {
		this.head=Head;
		this.tails=Tails;
		this.toss=Toss;
	}

	/**
	 * @return head head value
	 * */
	public int getHead() {
		return head;
	}

	/**
	 * Increase heads count value by one.  
	 * */
	public void setHead() {
		this.head++;
	}

	/**
	 * @return tails tails value
	 * */
	public int getTails() {
		return tails;
	}

	/**
	 * Increase tails count value by one.  
	 * */
	public void setTails() {
		this.tails++;
	}

	/**
	 * @return toss toss value
	 * */
	public int getToss() {
		return toss;
	}

	/**
	 * Increase toss value by one. Remember toss is  game synonymous, 
	 * in other words setting toss will increase the game count. 
	 * */
	public void setToss() {
		this.toss++;
	}
}
