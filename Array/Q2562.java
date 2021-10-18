package Array;

import java.util.Scanner;

public class Q2562 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] list = new int[9];
		
		int max = 0, cnt = 0;
		for(int i = 0; i<list.length; i++) {
			list[i] = scan.nextInt();
			if(max<list[i]) {
				max = list[i];
				cnt = i+1;
			}
		} 
		
		System.out.println(max);
		System.out.println(cnt);
	}

}
