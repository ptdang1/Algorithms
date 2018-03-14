public class NumPaths{
   static long count =0;
   static long[][]memo;
   static long[]memo1D;

   public static void main(String[]args){
      int n=250;
      memo1D= new long[n+1];
      count=0;
      long fib=fib(n);
      System.out.println("Fibonacci of "+n+" equals "+fib);
      System.out.println("Fibonacci took this amount of rec "+count);
      int r=100;
      int c=100;
      memo = new long[r+1][c+1];
      long result=numPaths(r,c);
      System.out.println("Number of shortest paths from " +r+"," +c+" are: "+ result);
      System.out.println("Number of recursions = "+count);
   
   }
   public static long numPaths(int r, int c){
      count=count+1;
      if(memo[r][c] >0) return memo[r][c];
      if(r==0 && c==0)return 0;
      if(c==0) return 1;
      if(r==0) return 1;
      long np =numPaths(r,c-1)+ numPaths(r-1,c);
      memo[r][c] =np;
      return np;
   }
   public static long fib(int n){
      
      count+=1;
      if(memo1D[n] >0) return memo1D[n];
      if(n<=1)return n;
      long result= fib(n-1)+fib(n-2);
      memo1D[n]=result;
      return result;
   }
   
}