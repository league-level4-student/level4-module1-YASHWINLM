import java.util.Random;

import _06_Snake._00_SnakeGame;

public class Mod1CheckPoint {
	
	
	public static void statements() {
		Random rand = new Random();
		int i = rand.nextInt(4);
		switch (i) {
		case 0:
			System.out.println("0");
			break;

		case  1:
			System.out.println("1");
			break;
		case  2:
			System.out.println("2");
			break;
		case  3:
			System.out.println("3");
			break;
		case  4:
			System.out.println("4");
			break;
		}
		
	}
	
	public static void main(String[] args) {
		statements();
	}
}
