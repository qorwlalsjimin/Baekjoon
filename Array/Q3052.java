package Array;

import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] numlist = new int[10];
		int[] count = new int[10];
		
		for(int i = 0; i<numlist.length; i++) {
			numlist[i] = scan.nextInt();
			count[i] = numlist[i]%42;
		}
		
		int cnt = 0;
		for(int i = 0; i<numlist.length-1; i++) {
			for(int j = i+1; j<numlist.length; j++) {
				if(count[i]==count[j])
					count[j]=42; //나머지로 42는 나올 수 없는 숫자
			}//for
		}//for

		for(int i = 0; i<count.length; i++) {
			if(count[i]!=42) //나머지로 42는 나올 수 없는 숫자
				cnt++;
		}
		
		System.out.println("**"+cnt);
			
	}//main

}
