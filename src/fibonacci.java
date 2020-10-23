//Shaminda_Abeysekara_301056885
public class fibonacci {
	static int fibonacci_Recursive(int n) 
    { 
    if (n <= 1) 
       return n; 
    else
    	return fibonacci_Recursive(n-1) + fibonacci_Recursive(n-2); 
    } 
			
	       
    public static void main (String args[]) 
    { 
    int num = 10; 
    
    for(int i = 1; i <= num; i++ ) {
    	int fibonacci = fibonacci_Recursive(i);
    	String text = String.format("Fibonacci of %s is %s ",i,fibonacci); 
    	System.out.println(text);
    }
     
   } 

}

