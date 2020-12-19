package palindrome1;

public class PalAssign {

	public static void main(String[] args) {
		 // A function to check 
	    // if n is palindrome 
	    static int isPalindrome(int n) 
	    { 
	          
	        // Find reverse of n 
	        int rev = 0; 
	        for (int i = n; i > 0; i /= 10) 
	            rev = rev * 10 + i % 10; 
	              
	        // If n and rev are same,  
	        // then n is palindrome 
	        return(n == rev) ? 1 : 0; 
	    } 
	      
	    // prints palindrome between 
	    // min and max 
	    static void countPal(int min, int max) 
	    { 
	        for (int i = min; i <= max; i++) 
	            if (isPalindrome(i)==1) 
	                System.out.print(i + " "); 
	    } 

	}

}
