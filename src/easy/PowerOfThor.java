package easy;

import java.util.Scanner;

/**
 * https://www.codingame.com/training/easy/power-of-thor-episode-1
 * 
 * @author _DELEX
 */
public class PowerOfThor {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int lightX = in.nextInt(); // the X position of the light of power
		int lightY = in.nextInt(); // the Y position of the light of power
		int initialTX = in.nextInt(); // Thor's starting X position
		int initialTY = in.nextInt(); // Thor's starting Y position
		int thorX = initialTX;
		int thorY = initialTY;

		// game loop
		while (true) {
			/*int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.*/
			String directionX = "";
			String directionY = "";
			if (thorX > lightX) {
				directionX = "W";
				thorX = thorX - 1;
			} else if (thorX < lightX) {
				directionX = "E";
				thorX = thorX + 1;
			}

			if (thorY > lightY) {
				directionY = "N";
				thorY = thorY - 1;
			} else if (thorY < lightY) {
				directionY = "S";
				thorY = thorY + 1;
			}
			 // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
			System.out.println(directionY + directionX); // A single line  providing the move to be made: N NE E SE S SW W or NW
			in.close();
		}
	}
}
