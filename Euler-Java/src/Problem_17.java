import java.util.HashMap;
import java.util.Map;

public class Problem_17 {
	public static void main(String args[])
	{
		Map<Integer, String> number = new HashMap<Integer, String>();
		number.put(1, "one");
		number.put(2, "two");
		number.put(3, "three");
		number.put(4, "four");
		number.put(5, "five");
		number.put(6, "six");
		number.put(7, "seven");
		number.put(8, "eight");
		number.put(9, "nine");
		number.put(10, "ten");
		number.put(11, "eleven");
		number.put(12, "twelve");
		number.put(13, "thirteen");
		number.put(14, "fourteen");
		number.put(15, "fifteen");
		number.put(16, "sixteen");
		number.put(17, "seventeen");
		number.put(18, "eighteen");
		number.put(19, "nineteen");
		number.put(20, "twenty");
		number.put(30, "thirty");
		number.put(40, "forty");
		number.put(50, "fifty");
		number.put(60, "sixty");
		number.put(70, "seventy");
		number.put(80, "eighty");
		number.put(90, "ninety");
		number.put(100, "hundred");
		number.put(1000, "thousand");
		
		Integer tally = 0;
		Integer k = 0;
		
		char zero_c = '0';
		String zero = Character.toString(zero_c);
	
		for (int n = 1; n <= 1000; n++)
		{
			String x = String.valueOf(n);
			if (x.length() == 1)
			{
				// The first 9 numbers are 1 digit -- in the dictionary
				k = number.get(n).length();
				System.out.format("n = %d k = %d%n", n, k);
				
			} 
			else if (x.length() == 2)
			{
				char x1 = x.charAt(0);
				char x2 = x.charAt(1);
				if (n < 20)
				{
					// The numbers under 20 -- in the dictionary
					k = number.get(n).length();
					System.out.format("n = %d k = %d%n", n, k);
				} 
				else {
					if (x2 == '0')
					{
						// The numbers under 100 and greater than 19 -- in the 
		                // dictionary ending in '0', (20, 30, 40 ....)
						k = number.get(n).length();
						System.out.format("n = %d k = %d%n", n, k);
					} 
					else
					{
						// The other numbers under 100 greater than 19
						String x1a = (x1 + zero); 
						int x1a_i = Integer.parseInt(x1a);
						String x2_s = Character.toString(x2);
						int x2_i = Integer.parseInt(x2_s);
			
						k = (number.get(x1a_i).length()) + (number.get(x2_i).length());
						System.out.format("n = %d k = %d%n", n, k);
					}
				}
			} 
			else if (x.length() == 3)
			{
				// add 3 for 'and' i.e. -- two-hundred and ten
				char x1 = x.charAt(0);
				char x2 = x.charAt(1);
				char x3 = x.charAt(2);
				
				String x1_s = Character.toString(x1);
				String x2_s = Character.toString(x2);
				String x3_s = Character.toString(x3);
				
				String x1a = (x2_s + zero);
				String x1aa = (x2_s + x3_s);
				
				int x1_i = Integer.parseInt(x1_s);
				int x3_i = Integer.parseInt(x3_s);
				
				int x1a_i = Integer.parseInt(x1a);
				int x1aa_i = Integer.parseInt(x1aa);
				
				if (x1 == '1' && x2 == '0' && x3 == '0')
				{
					// 100 -- in the dictionary
					k = number.get(1).length() + number.get(100).length();
					System.out.format("n = %d k = %d%n", n, k);
				} 
				else if (x2 == '0' && x3 == '0')
				{
					// Consider 200, 300, 400, 500, 600, 700, 800, and 900
					k = number.get(x1_i).length() + number.get(100).length();
					System.out.format("n = %d k = %d%n", n, k);
				} 
				else if (x2 == '0' && x3 != '0')
				{
					// Consider 101, 102 ... 109, 201, 202, ... 209 etc.
					k = 3 + number.get(x1_i).length() + number.get(100).length() + number.get(x3_i).length();
					System.out.format("n = %d k = %d%n", n, k);
				} 
				else if (x2 != '0' && x3 == '0')
				{
					// Consider 110, 120, ... 190, 210, 220, ... 290 etc.
					k = 3 + number.get(x1_i).length() + number.get(100).length() + number.get(x1a_i).length();
					System.out.format("n = %d k = %d%n", n, k);
				} 
				else if (x2 == '1' && x3 != '0')
				{
					// Consider the teens 111, 112, ... 119, 211, 212, ... 219 etc.
					k = 3 + number.get(x1_i).length() + number.get(100).length() + number.get(x1aa_i).length();
					System.out.format("n = %d k = %d%n", n, k);
				} 
				else
				{
					// Consider all the other numbers
					k = 3 + number.get(x1_i).length() + number.get(100).length() + number.get(x1a_i).length() + number.get(x3_i).length();
					System.out.format("n = %d k = %d%n", n, k);
				}
			} 
			else
			{
				// 1000 -- two parts (one and thousand) -- in the dictionary
				k = number.get(1).length() + number.get(1000).length();
				System.out.format("n = %d k = %d%n", n, k);
			}
			
		tally += k;
		
		}
		System.out.format("tally = %d%n", tally);
	}

}
