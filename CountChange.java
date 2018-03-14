public class CountChange{

	public static int[] coins ={1,5,10,25};
	public static int [][] memo2D;
	public static void main(String[]args){
			int n =100_000;
			memo2D=new int[n+1][coins.length+1];
			int count = count(n,0);
			System.out.println("Number of ways to make " +n+ " equal "+count);

		
	}
	public static int count(int n, int pos){
		if(memo2D[n][pos] >0) return memo2D[n][pos];
		if(n<0) return 0;
		if(n==0) return 1;
		if(pos>=coins.length) return 0;
		int numWays=0;
		for(int i=pos;i<coins.length;i++){

			numWays += count(n-coins[i],i);

		}
		//memo2D[n][pos]=numWays;
		return numWays;

	}

}