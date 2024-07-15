package basic_grammer_loop;

import java.util.Scanner;

public class ForSyntax {
	public static void main(String[] args) {
		
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0;i<1001;i++) {
			sum1+=i;
			}
		for(int i=0;i<101;i+=2) {
			sum2+=i;
			}
		
		
		System.out.println(sum1 + " "+sum2);
		
		for (int i =2 ;i<10 ;i++) {
			for(int j =1 ; j<10 ;j++) {
			System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
		for (int i=1 ;i<7;i++) {
			System.out.println();
			for(int j =0 ;j<i;j++) {
				System.out.print("*");
			}
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i=1 ; i<b+1;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
		
	}
	
}
