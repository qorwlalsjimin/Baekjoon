package Array;

import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] score = new int[n];
		double[] result = new double[score.length];
		
		for(int i = 0; i<score.length; i++)
			score[i] = scan.nextInt();
		
		int max = 0;
		for(int i = 0; i<score.length-1; i++) {
			if(score[i]>score[i+1])
				max = score[i];
			else
				max = score[i+1];
		}

		float sum = 0;
		for(int i = 0; i<score.length; i++) {
			result[i] = ((double)score[i]/(double)max)*100;
			System.out.println(result[i]);
			sum += result[i];
		}

		double average = (double)sum/n;
		System.out.println("*"+average);

	}

}
