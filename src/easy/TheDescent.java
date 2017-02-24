package easy;

import java.util.Scanner;
/**
 * https://www.codingame.com/training/easy/the-descents
 * @author _DELEX
 */
public class TheDescent {
	public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);

    	// game loop
    	int hMax=0;
    	while (true) {
        	int tmp=0;
        	for (int i = 0; i < 8; i++) {
            	int mountainH = in.nextInt();
            	if(tmp<mountainH){
                	tmp=mountainH;
                	hMax=i;
            	}
                	// represents the height of one mountain.
        	}

        	// Write an action using System.out.println()
        	// To debug: System.err.println("Debug messages...");

        	System.out.println(hMax); // The index of the mountain to fire on.
        in.close();
    	}
	}
}
