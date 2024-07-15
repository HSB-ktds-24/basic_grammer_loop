package basic_grammer_loop;

import java.util.Random;

public class WhileSyntax {

	public static void main(String[] args) {
		int count =0;
		/*while(count <10) {
			System.out.println(count);
			count++;
		}*/
		
		
		Random r = new Random();
		int k= r.nextInt(Integer.MAX_VALUE);
		

		
		while(k>0) {
			
			int damage = r.nextInt(1000);
			System.out.println(k);
			k -= damage;
		}
		
	}

}
