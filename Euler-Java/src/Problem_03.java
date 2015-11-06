import java.util.ArrayList;
import java.util.List;
// TEST for new GitHub for desktop
public class Problem_03 {
	public static void main(String args[])
	{
		Problem_03 prob_03Obj = new Problem_03(); // Create Problem_3 object
		long number = 600851475143L; // Large composite number
		double sqrtNumber = Math.sqrt(number) + 1; // Find the sqrt of number
		int sN = (int)sqrtNumber; // Make the sqrt an integer
		List<Integer> primes = prob_03Obj.getListOfPrimes(sN); // Generates a list of primes up to sqrt
		List<Integer> Factors = new ArrayList<Integer>(); // Create a list for the prime factors
		for(int i = 0; i < primes.size(); i++) // For loop up to the size of primes list
		{
			int prime = primes.get(i); // Gets the (i)th element in the primes list
			if(prime == 1) // 1 is not a prime
			{
				continue;
			}
			int s = 1; // Counter for while loop
			while(s == 1)
			{
				if(number % prime == 0) // If number modulus prime is equal 0
				{
					Factors.add(prime); // Add that prime to the prime factors list
					number = number / prime; // Find the next number according to the algorithm
				} else 
				{
					s = 0; // if we are done with that prime, breaks the while loop
				}
				
			}
		}
		System.out.println(Factors); // Prints out the prime factors of number
	}
	
// Start: http://techdive.in/java/java-prime-number
// Returns 1 as a prime - accounted for that in the main method
	
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

        public List<Integer> getListOfPrimes(int end)
        {
                List<Integer> lstInt = new ArrayList<Integer>();

                lstInt.add(1);
                lstInt.add(2);
                boolean flag = true;

                for (int i = 3; i < end; i++)
                {
                        flag = true;
                        int sqI = (int)Math.sqrt(i);
                        for (int j = 1; j < lstInt.size(); j++)
                        {
                                if (i % lstInt.get(j) == 0)
                                {
                                        flag = false;
                                        break;
                                }

                                if (sqI < lstInt.get(j))
                                {
                                        break;
                                }
                        }
                        if (flag == true)
                        {
                                lstInt.add(i);
                        }
                }
                return lstInt;
        }
// End: http://techdive.in/java/java-prime-number
	
	}
