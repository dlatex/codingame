package easy;

import java.util.Scanner;

/**
 * https://www.codingame.com/training/easy/ascii-art
 * 
 * @author _DELEX
 */
public class AsciiArt {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int H = in.nextInt();
		in.nextLine();
		String T = in.nextLine().toUpperCase();

		for (int i = 0; i < H; i++) {
			String ROW = in.nextLine();
			for (int j = 0; j < T.length(); j++) {
				int b = (int) T.charAt(j);
				if (b >= 65 && b <= 90) {
					System.out.print(ROW.substring((b - 65) * L, ((b - 65) + 1) * L));
				} else {
					System.out.print(ROW.substring(26 * L));
				}
			}

			// Write an action using System.out.println()
			// To debug: System.err.println("Debug messages...");
			System.out.println();
			in.close();
		}

	}
}
