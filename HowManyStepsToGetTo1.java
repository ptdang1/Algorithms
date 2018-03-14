import java.util.*;
public class HowManyStepsToGetTo1{
   public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println( "Enter a positive number: ");
      int n = input.nextInt();
   
      System.out.println( howManyStepsToGetTo1(n));
      //System.out.println(n)   
   }
   public static int howManyStepsToGetTo1(int n){
   
      int counter = 0;
      int count = 0;
      
      while(n != 1){
         if(n % 2 == 0){//even
            n = n/2;
            count++;
         }
         else{
            n = (n * 3) + 1;//odd         
            count++;
         }
      }
   
      return count;
   }
}