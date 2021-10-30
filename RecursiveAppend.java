/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
  
    	if (n==0){
    		return original;
    	}
    	else {
    		return appendNTimes(original,n-1)+original;
    	}
}

    public static void main (String[] args) {

	// WRITE TEST CASES HERE to test your method
    	String original="cat";
    	int n = Integer.parseInt(args[0]);
    	System.out.println(appendNTimes(original,n));

    }
}
