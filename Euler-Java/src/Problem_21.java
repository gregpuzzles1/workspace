import java.util.ArrayList;
import java.util.List;

public class Problem_21 {
	public static void main(String args[]){
		int tally = 0;
		for(int y = 1; y <= 10000; y ++){
			List<Integer> x = factors(y);
			int x1 = get_total(x);
			List<Integer> x3 = factors(x1);
			int x4 = get_total(x3);
			if((y == x4) && (y != x1)){
				tally += y;
			}
		}
		System.out.format("Tally = %d%n", tally);
	}
	
	public static List<Integer> factors(int number){
		List<Integer> L = new ArrayList<Integer>();
		for(int i = 1; i <= ((number / 2) + 1); i ++){
			if(number % i == 0){
				L.add(i);
			}
		}
		return L;
	}
	
	public static Integer get_total(List<Integer> list) {
		     Integer sum= 0; 
		     for (Integer i:list)
		         sum = sum + i;
		     return sum;
	}
}
