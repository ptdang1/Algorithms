import java.util.Scanner;
public class Palindrone{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a word to check for palindrone: ");
   
      String pal = input.nextLine();
      String reverse = "";
      for (int i = pal.length()-1;i >=0; i--){
         reverse += pal.charAt(i);
      }
      if(pal.equals(reverse)){
         System.out.println("String is a palindrone");
      }
      else{
         System.out.println("String is not a palindrone");
      }
   }
}