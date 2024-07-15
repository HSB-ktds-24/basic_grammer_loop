package basic_grammer_loop;

import java.util.Scanner;

public class Test_02 {


	public static void main(String[] args) {
		// 2번 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단을 입력하시오 : ");
		int x = sc.nextInt();
		if(x<=0) {
			return;
		}
		for(int i=1;i<10;i++) {
			System.out.println(x+"*"+i+"=" +x*i);
		}
		
		sc.close();
	}

}
