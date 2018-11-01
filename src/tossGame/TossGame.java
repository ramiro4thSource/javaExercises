package tossGame;
import tossGame.GameClass;
import java.util.*;

/**
 * Contains the "Toss-up". There is a main method included here to execute main logic
 * */
public class TossGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomize = new Random();
		GameClass game = new GameClass();
		
		
		
		//Keep in mind the next rule: 0-tails , 1-heads
		for(int i=0; i<10;i++) {
			if(randomize.nextInt(2)==1) {
				game.setHead();
			}
			else {
				game.setTails();
			}
			game.setToss();
		}
		
		System.out.println(String.format("Total of games: %d ---> heads: %d and tails: %d ", game.getToss(),game.getHead(),game.getTails()));
		
		
		
	}

}
