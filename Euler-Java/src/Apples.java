
public class Apples {
	public static void main(String [] args){
		int firstarray[][] = {{8,9,10,11},
				{12,13,14,15}};
		int secondarray[][] = {{30,31,32,33},{43},{4,5,6}};
		
		System.out.println("This is the first array");
		display(firstarray);
		
		System.out.println("This is the second array");
		display(secondarray);
		
		System.out.println(isPrime(107));
	} 
	public static void display(int x[][]){
		for(int row = 0; row < x.length; row++){
				for(int column = 0; column < x[row].length; column++){
					System.out.print(x[row][column]+"\t");
				} 
				System.out.println();
		}
	}
	public static boolean isPrime(int n)
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
