package easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.codingame.com/training/easy/horse-racing-duals
 * @author _DELEX
 */
public class HorseDual {
	public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
    	int N = in.nextInt();
    	int[] power = new int[N];
    	for (int i = 0; i < N; i++) {
        	int pi = in.nextInt();
        	power[i] = pi;
    	}
    	Arrays.sort(power);
    	// Write an action using System.out.println()
    	// To debug: System.err.println("Debug messages...");
    	int val;
    	int r = 10000000;
    	for(int i = 0 ; i < N - 1 ; i++){
        	val = Math.abs(power[i] - power[i+1]);
        	if(val<r) r = val;
    	}
   	 
    	System.out.println(r);
    	in.close();
	}
}
