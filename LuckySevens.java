/*************************************************************************
 *  Compilation:  javac LuckySevens.java
 *  Execution:    java LuckySevens 421
 *
 *  @author:Sanchita Patwari
 *
 * LuckySevens takes an int as a command-line argument and displays
 * how many digits in the integer number are 7s.  
 *
 * Note: the number can be negative.
 *
 *  % java LuckySevens 3482
 *  0
 *
 *  % java LuckySevens 372777
 *  4
 * 
 *  % java LuckySevens -2378272
 *  2
 *************************************************************************/

public class LuckySevens {

    public static void main(String[] args) {

	int number = Integer.parseInt(args[0]);
	int count = 0;

	if (number<0){
		number=Math.abs(number);
	}

	while (number>=7){
		if (number%10==7){
			count+=1;
			number=number/10;
		}
		else {
			number=number/10;
		}

		}

		System.out.println(count);
    }

 }
