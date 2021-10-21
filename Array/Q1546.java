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
		for(int i = 0; i<score.length; i++) {
		if(score[i]>max)
			max = score[i];
		}//for

		float sum = 0;
		for(int i = 0; i<score.length; i++) {
			result[i] = ((double)score[i]/(double)max)*100;
			sum += result[i];
		}

		double average = (double)sum/n;
		System.out.println("*"+average);

	}

}
