import java.util.*;
public class Donuts{
   public static void main (String[] args){
   
      String[] donuts = new String [3];
         
      Scanner input = new Scanner(System.in);
      System.out.print("Enter " + donuts.length + " donuts. ");
      for (int i = 0; i < donuts.length; i++){
         donuts[i] = input.nextLine();
      } 
      for (int i = 0; i < donuts.length; i++){
         System.out.print(donuts[i] + " "); 
         //System.out.print(donuts);        
      }
   }
}