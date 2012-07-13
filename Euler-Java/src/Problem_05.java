
public class Problem_05 {
	public static void main(String args[]){
		Problem_05 prob_05Obj = new Problem_05();
		int n = 2520;
		int Switch = 1;
		while (Switch == 1){
			Integer smallest = prob_05Obj.evenlyDivisible(n);
			if(smallest != 1){
				System.out.println(smallest);
				Switch = 0;
			}else{
				n += 2520;
			}
		}
	}
	
	public Integer evenlyDivisible(int n)
	{
		int counter = 0;
		for (int i = 1; i < 21; i++)
		{
			if(n % i == 0)
			{
				counter = counter + 1;
				if (counter == 20){
					return n;
				}
				else{
					continue;
				}
			}
			else{
				return 1;
			}
		}
		return 1;
	}
}

