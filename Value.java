public class Value{
	
	public static int find(int x, int y) {

		int ans= 0;
		int larger= x;
		int smaller = y;

		if (y>x){
				larger=y;
				smaller=x;
			}

		for (int i = 2; i<=smaller; i++){
			ans=larger*i;
			if(ans%smaller==0){
				i=smaller+1;
			}
				else{
					ans=0;
			
				}
			}
			return ans;
	}

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int c= find(a,b);

	System.out.println(c);	

	}
}