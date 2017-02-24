package easy;

import java.util.Scanner;

/**
 * https://www.codingame.com/training/easy/chuck-norris
 * 
 * @author _DELEX
 */
public class ChuckNorris {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String MESSAGE = in.nextLine();
		String str = "";
		byte dern = -1;

		for (int i = 0; i < MESSAGE.length(); i++) {
			byte c = (byte) MESSAGE.charAt(i);
			for (int j = 6; j >= 0; j--) {
				byte cour = (byte) ((c >>> j) & 0x01);
				if (cour != dern) {
					if (dern != -1)
						str += " ";
					if (cour == 0)
						str += "00 0";
					else
						str += "0 0";
					dern = cour;
				} else
					str += "0";
			}
		}
		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");
		System.out.println(str);
		in.close();
	}
}
