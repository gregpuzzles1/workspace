import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.File;

public class Problem_22 {
	public static void main(String args[]){
		try
	    {
	       Scanner in = new Scanner(new File("names.txt")).useDelimiter("[\",]+");
	       ArrayList<String> names = new ArrayList<String>();
	       while (in.hasNext())
	       {
	    	   names.add(in.next());
	       }
	       Collections.sort(names);
	       
	       int z = 0;
	       for(int i = 0; i <= names.size() - 1; i ++){
	    	   int x2 = 0;
	    	   int y = 0;
	    	   String name = names.get(i);
	    	   for(int m = 0; m <= name.length() - 1; m ++){
	    		   int x1 = letter_counter(name.charAt(m));
	    		   x2 += x1;
	    	   }
	    	   y = x2 * (i + 1);
	    	   z += y;
			}
	       System.out.format("Total = %d%n", z);
	    }
		catch( FileNotFoundException filenotfoundexcption )
		{
		   System.out.println( "names.txt, does not exist" );
		}
		 
		catch( IOException ioexception )
		{
		   ioexception.printStackTrace( );
		}
	}
	
	public static Integer letter_counter(char letter_u)
	{
		String letter = Character.toString(letter_u);
		Map<String, Integer> letv = new HashMap<String, Integer>();
		letv.put("A", 1);
		letv.put("B", 2);
		letv.put("C", 3);
		letv.put("D", 4);
		letv.put("E", 5);
		letv.put("F", 6);
		letv.put("G", 7);
		letv.put("H", 8);
		letv.put("I", 9);
		letv.put("J", 10);
		letv.put("K", 11);
		letv.put("L", 12);
		letv.put("M", 13);
		letv.put("N", 14);
		letv.put("O", 15);
		letv.put("P", 16);
		letv.put("Q", 17);
		letv.put("R", 18);
		letv.put("S", 19);
		letv.put("T", 20);
		letv.put("U", 21);
		letv.put("V", 22);
		letv.put("W", 23);
		letv.put("X", 24);
		letv.put("Y", 25);
		letv.put("Z", 26);
		
		int lc = letv.get(letter);
		return lc;
	}
}
