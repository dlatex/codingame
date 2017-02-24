package medium;

import java.util.Scanner;

public class ConwaySequence {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int R = in.nextInt();
		int L = in.nextInt();

		if (L == 0) System.out.println("");

		if (L == 1) System.out.println(R);

		String previousStr = "";
		String str = Integer.toString(R);
		int prev;
		int count;
		for (int loop = 2; loop <= L; loop++) {
			previousStr = str;
			str = "";
			String[] digits = previousStr.split(" ");

			prev = Integer.parseInt(digits[0]);
			count = 1;
			for (int i = 1; i < digits.length; i++) {
				int curr = Integer.parseInt(digits[i]);
				if (curr == prev) {
					count++;
				} else {
					str += String.format("%d %d ", count, prev);
					count = 1;
					prev = curr;
				}
			}
			str += String.format("%d %d", count, prev);
		}
		System.out.println(str);
	}
}
