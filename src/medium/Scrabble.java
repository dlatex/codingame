package medium;

import java.util.HashMap;
import java.util.Scanner;
/**
 * https://www.codingame.com/training/medium/scrabble
 * @author _DELEX
 */
public  class Scrabble {    
    public static void maisn(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] dict = new String[N];
        int maxScore = 0;
        String reponse = " ";
        in.nextLine();
        
        for (int i = 0; i < N; i++) {
            dict[i] = in.nextLine();
        }
        
        String mots = in.nextLine();
        
        letterValues = new HashMap<String, Integer>();
        letterValues.put("a",1);
        letterValues.put("b",3);
        letterValues.put("c",3);
        letterValues.put("d",2);
        letterValues.put("e",1);
        letterValues.put("f",4);
        letterValues.put("g",2);
        letterValues.put("h",4);
        letterValues.put("i",1);
        letterValues.put("j",8);
        letterValues.put("k",5);
        letterValues.put("l",1);
        letterValues.put("m",3);
        letterValues.put("n",1);
        letterValues.put("o",1);
        letterValues.put("p",3);
        letterValues.put("q",10);
        letterValues.put("r",1);
        letterValues.put("s",1);
        letterValues.put("t",1);
        letterValues.put("u",1);
        letterValues.put("v",4);
        letterValues.put("w",4);
        letterValues.put("x",8);
        letterValues.put("y",4);
        letterValues.put("z",10);
        
        for (int i = 0; i < N; i++) {
            if (isPossible(dict[i], mots)) {
                int score = score(dict[i]);
                if (score > maxScore) {
                    reponse = String.valueOf(dict[i]);
                    maxScore = Integer.valueOf(score);
                }
            }
        }
        System.out.println(reponse);
    }
    public static HashMap<String, Integer> letterValues;	    
    public static boolean isPossible(String word, String letters) {	        
        if (word.equals("")) return true;
        String firstLetter = word.substring(0,1);
        int index = letters.indexOf(firstLetter);
        if (index == -1) return false;
        
        return isPossible(word.substring(1), letters.replaceFirst(firstLetter, ""));
        
    }
    
    public static int score(String word) {	        
        int total = 0;  
        for (int i = 0; i < word.length(); i++) {
            total += letterValues.get(word.substring(i,i+1));
        }
        return total;	        
    }
}
