import java.math.BigInteger;


public class Fibonacci

{
  public static void main( String [] args )
  {
	BigInteger n = BigInteger.valueOf(7);
    System.out.println( "Factorial ( 7 ) is "
                      + factorial( n ) );
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

