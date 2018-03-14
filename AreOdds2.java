import java.util.Scanner;
public class AreOdds2{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a: ");
      int a = input.nextInt();
      
      System.out.println("Enter b: ");
      int b = input.nextInt();
      
      System.out.println("Enter c: ");
      int c = input.nextInt();
      
      if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0)
         System.out.println("all are odd");      
        
        else if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) {    
            if( a % 2 != 0){
               System.out.println("a is odd");
            }
            if(b % 2 != 0){
               System.out.println("b is odd");
            }   
            if(c % 2 != 0){
               System.out.println("c is odd");
            }
         }
          
      else{
         System.out.println ("none are odd");
      }   
      
         }
}          
