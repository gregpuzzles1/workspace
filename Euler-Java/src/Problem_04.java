
public class Problem_04 {
	public static void main(String args[]){
		Problem_04 prob_04Obj = new Problem_04();
		int largest = 0;
		for (int i = 100; i < 1000; i++){
			for (int r = 100; r < 1000; r++){
				String x = Integer.toString(i * r);
				String y = prob_04Obj.reverse(x);
				int xx = Integer.parseInt((x));
				if (x.equals(y)) {
					if (xx > largest){
						largest = (xx);
					}
				}
					
				}
			}
	System.out.println(largest);	
	}
		
// http://www.vbforums.com/showthread.php?t=320907
	 public String reverse(String arg)
	 {
		String tmp = null;
		if (arg.length() == 1)
		{
			return arg;
		}
		
		else
		{
			String lastChar = arg.substring(arg.length() -1, arg.length());
			
			String remainingString = arg.substring(0, arg.length() -1);
	
			tmp = lastChar + reverse(remainingString);
			return tmp;
			
			
		}
	  }
// http://www.vbforums.com/showthread.php?t=320907
}
