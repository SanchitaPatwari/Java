public class ArrayAvg {


	public static void main(String[] args) {
		
		int [] a = {8,7,9,2,5,3,7,4,9};
		int average= 0;
		int value=0;

		for (int i = 0; i<a.length; i++){
			value+=a[i];
		}

		average= value/a.length;

		System.out.println(average);
	}
}