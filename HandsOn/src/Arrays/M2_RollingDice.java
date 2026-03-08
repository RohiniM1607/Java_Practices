/*
 * The H4_DiceRollFrequency class implements a program
 * that simulates rolling a dice 100 times and
 * displays the frequency of each face using arrays.
 */

package Arrays;

import java.util.Random;

public class M2_RollingDice {

	public static void main(String[] args) {
		Random r = new Random();

        int freq[] = new int[7]; 
        for(int i = 1; i <= 100; i++) {
            int roll = r.nextInt(6) + 1; 
            freq[roll]++; 
        }

        System.out.println("Dice Roll Frequency (100 times)");
        for(int i = 1; i <= 6; i++) {
            System.out.println("Number " + i + " occurred " + freq[i] + " times");
        }
	}

}
