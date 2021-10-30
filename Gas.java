/*************************************************************************
 *  Compilation:  javac Gas.java
 *  Execution:    java Gas 3.40 15.0 true
 *
 *  @author:Sanchita Patwari
 *
 * The program Gas computes and displays the price a
 * person will pay for gas at the gas station.
 *
 *  % java Gas 3.40 15.0 false
 *  56.1
 *
 *  % java Gas 3.40 15.0 true
 *  51.0
 *
 *************************************************************************/

public class Gas {

	public static void main(String[] args) {

		double gas = Double.parseDouble(args[0]) ;
		double price = Double.parseDouble(args[1]) ;
		boolean cash = Boolean.parseBoolean(args[2]) ;

		if (gas<= 0 || price<=0) {
			System.out.println("Illegal input") ;
		}

		else if (cash== false){
			System.out.println(1.10*gas*price) ;
		}
		else {
			if (cash==true) {
				System.out.println(gas*price) ;
		}
		}


	}

}


