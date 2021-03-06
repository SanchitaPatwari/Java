/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author:Sanchita Patwari
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {
    	
    	double onesmallest = Double.MAX_VALUE;
    	double twosmallest= Double.MAX_VALUE;
    	

    			for(int i = 0; i<args.length; i++){
    				double value= Double.parseDouble(args[i]);
    				
    					if (value<=onesmallest){
    					onesmallest=value;

    					}
    					if (value<=twosmallest){
    					onesmallest=twosmallest;
    					twosmallest=value;
    					}
    			}
    			System.out.println(twosmallest);
    			System.out.println(onesmallest);


    	}

    }