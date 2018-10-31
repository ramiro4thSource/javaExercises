package catMouseGame;

import java.util.Random;

/**
 * Mouse class 	create a mouse hiding place.
 * */
public class Mouse {
	private int x;
	private int y;
	
	/**
	 * Unique constructor which create randomly a hiding place
	 * */
	public Mouse() {
		Random random = new Random();
		this.x= random.nextInt(5);
		this.y= random.nextInt(5);
	}
	
	/**
	 * @return X coordinate
	 * */
	public int getX() {
		return this.x;
	}
	
	/**
	 * @return Y coordinate
	 * */
	public int getY() {
		return this.y;
	}
}
