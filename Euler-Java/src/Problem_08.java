import java.io.*;

public class Problem_08 
	{
		  public static void main( String [] args )
		  {
		    try
		    {
		       FileReader fro = new FileReader( "1000.txt" );
		       BufferedReader bro = new BufferedReader( fro );
		       StringBuilder sb = new StringBuilder( );
		  
		       // declare String variable and prime the read
		       String stringfromFile = bro.readLine( );
		 
		       while( stringfromFile != null ) // end of the file
		       {
		          sb.append(stringfromFile); // append into one long string
		          stringfromFile = bro.readLine( );  // read next line
		       }
		       String str = sb.toString( ); // convert from StringBuilder to String
		       String fiveDigits = ""; // initialize fiveDigits
		       int largest = 0; // initialize largest
		       
		       for(int i = 0; i < str.length() - 4; i++){
		    	    fiveDigits = str.substring( i, ( i + 5 )); // substring of str for fiveDigits
		    	    
		    	    // convert each of the five digits into integers
		    	    int v = Integer.parseInt(fiveDigits.substring(0, 1));
		    	    int w = Integer.parseInt(fiveDigits.substring(1, 2));
		    	    int x = Integer.parseInt(fiveDigits.substring(2, 3));
		    	    int y = Integer.parseInt(fiveDigits.substring(3, 4));
		    	    int z = Integer.parseInt(fiveDigits.substring(4, 5));
		    	    
		    	    // find the product of each of the five digits
		    	    int product = v * w * x * y * z;
		    	    
		    	    // keep track of the largest product
		    	    if(product > largest)
		    	    {
		    	    	largest = product;
		    	    }
		       }
		       System.out.println("Largest = " + largest);
		       bro.close( );
		    }
		 
		    catch( FileNotFoundException filenotfoundexxption )
		    {
		      System.out.println( "1000.txt, does not exist" );
		    }
		 
		    catch( IOException ioexception )
		    {
		      ioexception.printStackTrace( );
		    }
		  }
	}
