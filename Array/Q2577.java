package Array;

import java.util.Scanner;

public class Q2577 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] list = new int[3];
		int[] number = new int[11];
		
		System.out.println("숫자 입력");
		int space=1;
		for(int i = 0; i<list.length; i++) {
			list[i] = scan.nextInt();
			space *= list[i]; //1728
		}
		
		int c_space = space; //1728
		int cnt = 0;
		while(c_space>0) {
			if(c_space/10>=0)
				cnt++; //4
			c_space/=10;
		}
		
		int range=1;
		for(int i = 1; i<cnt; i++)
			range*=10;
		
		for(int i = range; i>0; i/=10) {
			int n = space/i;
			switch(n) {
			case 0 : number[0]++;
				break;
			case 1 : number[1]++;
				break;
			case 2 : number[2]++;
				break;
			case 3 : number[3]++;
				break;
			case 4 : number[4]++;
				break;
			case 5 : number[5]++;
				break;
			case 6 : number[6]++;
				break;
			case 7 : number[7]++;
				break;
			case 8 : number[8]++;
				break;
			case 9 : number[9]++;
				break;
			case 10 : number[10]++;
				break;
			}
			space -= i*n;
		}
		
		for(int i = 0; i<number.length; i++)
			System.out.println(number[i]);
		
	}

}
