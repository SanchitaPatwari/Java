/*************************************************************************
 *  Compilation:  javac TrainTicket.java
 *  Execution:    java TrainTicket
 *
 *  @author:Sanchita Patwari
 *
 * The program TrainTicket takes two command-line arguments: an int
 * referring to the persons age and a boolean referring to whether or
 * not the ticket was bought at the train station (true for a ticket
 * bought at the train station). The program computes and displays the
 * ticket price the person needs to pay for the train ride.
 *
 *  % java TrainTicket 23.0 true
 *  13.20
 *
 *  % java TrainTicket 23.0 false
 *  15.84
 * 
 *  % java TrainTicket 230 false
 *  Illegal input
 *
 *************************************************************************/

public class TrainTicket {

	public static void main(String[] args) {

		int age = Integer.parseInt(args[0]);
		boolean trainstation = Boolean.parseBoolean(args[1]);
		double price = 13.20;

		if (age>120 || age<0 ) {
			System.out.println("Illegal input");
			return;
		}
		else if (age<7) {
			price=0;
		}
		else if (age<= 65) {
			price-=0;
		}
		else {
			price-=5.70;
		}
		if (trainstation==false) {
			price*=1.20;
			
		}
				System.out.println(price);

	}
	
}