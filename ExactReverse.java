import java.util.Scanner;
public class ExactReverse{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a String: ");
      String a = input.nextLine();
      
      System.out.println("Enter a String: ");
      String b = input.nextLine();
   
      String reverse = "";
      String original = ""; 
           
      for(int i = 0;i < a.length();i++){
         original += a.charAt(i);    
      }
      for (int j = b.length()-1; j >= 0; j--){
         reverse += b.charAt(j);
      }
       
      if(reverse.equals(original))
         System.out.println("exact match"); 
      else
         System.out.println("no match");
    
   }
}