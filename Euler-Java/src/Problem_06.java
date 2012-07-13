
public class Problem_06 {
	public static void main(String args[]){
		int sum_of_squares = 0;
		int square_of_sum = 0;
		int Sum = 0;
		for(int i = 1; i < 101; i++){
			int square = (int)Math.pow(i, 2);
			sum_of_squares += square;
			Sum += i;
		}
		square_of_sum = (int)Math.pow(Sum, 2);
		int Difference = square_of_sum - sum_of_squares;
		System.out.println("sum_of_squares = " + sum_of_squares);
		System.out.println("square_of_sum = " + square_of_sum);
		System.out.println("Difference is = " + Difference);
	}

}
