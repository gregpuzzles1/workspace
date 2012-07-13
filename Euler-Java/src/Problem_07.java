
public class Problem_07 {
	public static void main(String args[])
	{
		Problem_07 prob_07Obj = new Problem_07();
		int Switch = 1;
		int counter = 1;
		int primes = 0;
		while(Switch == 1){
			if (prob_07Obj.isPrime(counter)){
				primes += 1;
				counter += 2;
			} else
			{
				counter += 2;
			}
			if (primes == 10001){
				System.out.println(counter - 2);
				Switch = 0;
			}
		}
		
	}
	public boolean isPrime(int n)
    {
    int k = (int) Math.sqrt(n);
            for (int i = 2; i <= k; i++)
            {
                    if (n % i == 0)
                            return false;
            }
            return true;
    }
}

