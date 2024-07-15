package basic_grammer_loop;

public class Test_01 {

	public static void main(String[] args) {
		
		// 1번 문제
		int pocket = 10_000;
		int price = 18_000;
		
		
		
		if (pocket>=price) {
			System.out.println("관람가능\n남은금액: "+(pocket-price) );
			}
		else {
			System.out.println("관람불가능\n모자란금액: "+(price-pocket));
		}	
	}
}
