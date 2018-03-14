import java.util.Scanner;
public class ReverseString{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a String: ");
      String a = input.nextLine();
        
      String reverse = "";
      
             
      for (int i = a.length()-1; i >= 0; i--){
         reverse += a.charAt(i);
      }  
      System.out.println("Original string is: " + a);
      System.out.println("Reverse string is: " + reverse);
   }
}  
