package easy;

import java.util.Scanner;

/**
 * https://www.codingame.com/training/easy/defibrillators
 * @author _DELEX
 */
public class Defibrillators {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double longitude = Double.parseDouble(in.next().replace(',', '.'));
		in.nextLine();
		double latitude = Double.parseDouble(in.next().replace(',', '.'));
		in.nextLine();
		int n = in.nextInt();
		in.nextLine();
		String closestPlace = "";
		double closest = Double.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			String defribilators = in.nextLine();
			String[] tokens = defribilators.split(";");
			double longitude2 = Double.parseDouble(tokens[4].replace(',', '.'));
			double latitude2 = Double.parseDouble(tokens[5].replace(',', '.'));
			double x = (longitude2 - longitude) * Math.cos((latitude + latitude2) / 2);
			double y = latitude2 - latitude;
			double d = Math.hypot(x, y) * 6371;
			if (d < closest) {
				closestPlace = tokens[1];
				closest = d;
			}
		}
		System.out.println(closestPlace);
		in.close();
	}

}
