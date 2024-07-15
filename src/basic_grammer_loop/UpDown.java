package basic_grammer_loop;

import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		double random = Math.random();
		
		int num = (int)random*100; 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int k = sc.nextInt();
			
			if(num==k) {System.out.println("Yes");break;}
			else if(num>k) {System.out.println("up");}
			else {System.out.println("down");}
		}
				
	}

}
