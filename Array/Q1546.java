package Array;

import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] score = new int[n];
		
		for(int i = 0; i<score.length; i++)
			score[i] = scan.nextInt();
		
		double sum = 0.0;
		int max = 0;
		for(int i = 0; i<score.length; i++) {
			if(score[i]>max)
				max = score[i];
			sum+=score[i];
		}//for

		double average = (double)sum/max*100/n;
		System.out.println("*"+average);

	}

}
