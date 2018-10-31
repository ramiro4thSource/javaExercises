package catMouseGame;

import catMouseGame.Mouse;

/**
 * Cat class initialize a mouse instance and contains methods to catch a mouse. There is an additional method to show result as matrix
 * */
public class Cat {
	
	/**
	 *Mouse type will be useful to get mouse hiding place.
	 * */
	Mouse mouseHidingPlace;

	/**
	 * Unique constructor which initialize mouse instance
	 * */
	public Cat() {
		mouseHidingPlace= new Mouse();
	}
	
	/**
	 * This method will check if coordinates passed as parameters match with mouse hiding place.
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @return true if both parameters match with mouse hiding place.
	 * */
	public boolean catchMouse(int x, int y) {
		if(x>5||y>5)return false;		
		if(--x==mouseHidingPlace.getX() & --y==mouseHidingPlace.getY()) return true;
		return false;
	}
	
	/**
	 * Will show mouse hiding place as graphic matrix
	 * */
	public void showResult() {
		int[][] matrix = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==mouseHidingPlace.getX()&&j==mouseHidingPlace.getY())
				{
					matrix[i][j]=0;
				}
				else matrix[i][j]=1;
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
