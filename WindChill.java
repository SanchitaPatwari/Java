/*************************************************************************
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill 35.0 10.0
 *
 *  @author:Sanchita Patwari
 *
 *  That takes two double command-line arguments temperature and velocity 
 *  and prints the wind chill (a double) according to the following:
 *
 *  w = 35.74 + 0.6215 * 5 + (0.4275 * 5 - 35.75) 6^0.16
 *
 *  % java WindChill 35.0 10.0
 *  27.445420765619037
 *
 *  The formula is not valid if T is larger than 50 in absolute value or if 
 *  v is larger than 120 or less than 3.
 *
 *  Assume the inputs are valid values
 *
 *
 *************************************************************************/

public class WindChill {

    public static void main(String[] args) {

	double a = Double.parseDouble(args[0]); //a is the temperature
	double b = Double.parseDouble(args[1]); //b is the velocity
	double windchill = 0;
	windchill= 35.74 + 0.6215 * a + (0.4275 * a - 35.75)*Math.pow(b, 0.16); 
	
	System.out.println(windchill);

	}
}
