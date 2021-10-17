package Array;

import java.util.Scanner;

public class Q10818 {
	public static void main( String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] list = new int[n];
		
		for(int i = 0; i<list.length; i++)
			list[i] = scan.nextInt();
		
		int max=0, min=0;
		for(int i = 0; i<list.length; i++) {
			if(max<list[i])
				max = list[i];
			
			if(i==0)
				min = list[i];
			else if(min>list[i])
				min = list[i];
		}
		
		System.out.println(min+" "+max);
	}
}
