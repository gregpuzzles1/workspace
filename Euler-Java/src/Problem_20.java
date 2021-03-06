import java.math.BigInteger;

public class Problem_20 {
	public static void main(String args[]){
		BigInteger n = BigInteger.valueOf(100);
		int Sum = 0;
		BigInteger result = (factorial(n));
		String string_result = String.valueOf(result);
		
		for(int i = 0; i <= string_result.length() - 1; i ++){
			Character c = new Character(string_result.charAt(i));
		    String s = c.toString();
		    int n1 = Integer.parseInt(s);
			Sum += n1;
		}
		System.out.format("Sum = %d%n", Sum);
	}
	public static BigInteger factorial( BigInteger n )
	{
			if ( n.compareTo(BigInteger.ZERO) <= 0 ) { // base case
				return BigInteger.ONE;
			}
			else  {  // general case
				return ( n.multiply(factorial ( n.subtract(BigInteger.ONE)) ) );
			}
	}
}
