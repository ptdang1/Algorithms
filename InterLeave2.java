import java.util.*;
public class InterLeave2{
   public static void main (String[] args){
      Scanner input = new Scanner(System.in);
   
      System.out.println("Enter the first string: ");
      String s1 = input.nextLine();
   
      System.out.println("Enter a second string : ");
      String s2 = input.nextLine();
   
      String output = (interLeave(s1, s2));
      System.out.println(output);
   }
   public static String interLeave(String you, String me){
   
      int i= 0;
      int s1 = you.length();
      int s2 = me.length();
      String output = "";
   
      if(s1 >= s2){
         while (i < s2){
            output += you.charAt(i) + "" + me.charAt(i);
            i++;
         }
         while (i < s1){
            output += you.charAt(i);
            i++;
         }
      }
      if(s2 >=s1){
         while (i < s1){
            output += you.charAt(i) + "" + me.charAt(i);
            i++;
         }
         while (i < s2){
            output += me.charAt(i);
         }
      }
      return output;
   }
}

