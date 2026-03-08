/*
 * The P5_TestScores class implements the program that 
 * illustrates to replace the students score based on 
 * the condition.
 */

package com.JavaFundamentals;

import java.util.Scanner;

public class P5_TestScores {
	public static int[] replaceScore(int []scores) {
		int n = scores.length;
		int []modifiedScore = new int[n];
		for(int i=0; i<n; i++) {
			//int c=0;
			if(scores[i]%2==0) {
				modifiedScore[i] = 0;
				//c++;
			}
			if(scores[i]%2!=0) 
				modifiedScore[i] = 1;
			if(scores[i]%8==0)
				modifiedScore[i] = 2;
			if(scores[i]%10==3)
				modifiedScore[i] = 3;
			if(scores[i]%9==4)
				modifiedScore[i] = 4;
		}
		return modifiedScore;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		int scores[] = new int[100];
		int count = 0;
		System.out.println("Enter the scores(enter a negative number to stop input):");
		do {
			score = sc.nextInt();
			scores[count] = score;
			count++;
			
		}while(score>0);
		//System.out.println(count);
		int modifiedScore[] = replaceScore(scores);
		for(int num: modifiedScore)
			System.out.print(num+" ");
	}

}
