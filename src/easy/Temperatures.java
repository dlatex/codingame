package easy;

import java.util.Scanner;
/**
 * https://www.codingame.com/training/easy/temperatures
 * @author _DELEX
 */
public class Temperatures {
	public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt(); // the number of temperatures to analyse
    	in.nextLine();
    	String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
   	 
    	if(n == 0){
        	System.out.println(0);
    	} else {
        	int closest = Integer.MAX_VALUE;
        	String[] tArr = temps.split(" ");
        	for(int i = 0; i<tArr.length;i++){
            	int cur = Integer.parseInt(tArr[i]);
            	if(Math.abs(cur) < Math.abs(closest)){
            	closest = cur;   
            	}
            	if(Math.abs(cur) == Math.abs(closest)){
                	closest = Math.max(closest,cur);
            	}
        	}
        	System.out.println(closest);
        	in.close();
    	}
	}
}
