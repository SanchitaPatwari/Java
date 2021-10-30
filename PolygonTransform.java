/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Sanchita Patwari
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
    	double [] a = new double [array.length];
    		for (int i = 0; i<array.length; i++){
    			a[i]= array[i];
    			}
    			return a;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
   		copy(x);
   		copy(y);
    	for (int i=0;i<x.length; i++){
    		x[i]=x[i]*alpha;
    		y[i]=y[i]*alpha;
    	}

    	}

	// WRITE YOUR CODE HERE
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
   		copy(x);
   		copy(y);
    	for (int i=0;i<x.length; i++){
    		x[i]=x[i]+dx;
    		y[i]=y[i]+dy;
    	}

	// WRITE YOUR CODE HERE
    }

    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
   		copy(x);
   		copy(y);
    	theta= Math.toRadians(theta);

    	for(int i= 0; i<x.length; i++){
    		double a= x[i];
    		double b =y[i];
    		x[i]= a*Math.cos(theta)-b*Math.sin(theta);
    		y[i]= b*Math.cos(theta)+a*Math.sin(theta);

    	}
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
        StdDraw.setScale(-5.0, +5.0); 
double[] x = { 0, 1, 1, 0 }; 
double[] y = { 0, 0, 2, 1 }; 
double alpha = -2.0; 
StdDraw.setPenColor(StdDraw.RED); 
StdDraw.polygon(x, y); 
scale(x, y, alpha); 
StdDraw.setPenColor(StdDraw.BLUE);
StdDraw.polygon(x, y);
}}