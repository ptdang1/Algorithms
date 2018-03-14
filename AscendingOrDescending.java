import java.util.Scanner;

public class AscendingOrDescending{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print( "Enter # of values: " );      
      int n = input.nextInt();
      
      int[] vals = new int[n];
      
      System.out.print( "Enter " + vals.length + " values: " );
      boolean ascending = true;
      boolean descending = true;
      
      for( int i = 0; i < vals.length; i++ ){
         vals[i] = input.nextInt();
         
         if( i > 0 && vals[i] > vals[i-1] ){
            descending = false;
         }
         if( i > 0 && vals[i] < vals[i-1] ){
            ascending = false;
         }
      }
      if( ascending == true && descending == true ){
         System.out.println( "One value entered!" );
      }
      else if( ascending==true){
         System.out.println( "Ascending" );
      }
      else if( descending==true){
         System.out.println( "Descending" );
      }
      else{
         System.out.println( "Neither" );
      }
      for( int i=vals.length-1; i>=0; i--){
         System.out.print( vals[i] + " " );
      }  
      System.out.println( );
      
      System.out.println( "you entered: " + n + "!" );
      
      
   }
}