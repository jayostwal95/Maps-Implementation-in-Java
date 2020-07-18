//Java Program to print 1 to 100 in reverse order
package implementation;

public class Reverseorder {
	static void PrintReverseOrder(int N) 
	{ 
	      
	    // If N is less than 1 then  
	    // return static void function 
	    if (N <= 0) 
	    { 
	        return; 
	    } 
	    else
	    { 
	        System.out.print(N + " "); 
	  
	        // Recursive call of the function 
	        PrintReverseOrder(N - 1); 
	    } 
	} 
	
	public static void main(String[] args)
	{
		int N=100;
		PrintReverseOrder(N);
		
	}

}
