import java.util.*;
public class InterLeave{
   public static void main (String[] args){
            
      String s1 = "hhh";
      String s2 = "aaa";
      
      String output = interleave(s1, s2);
      System.out.println(output);     
   }     
   public static String interleave(String you, String me)
   {
      int i = 0;
      int s1 = you.length();
      int s2 = me.length();
      String output="";      
   
      if(s1>=s2)
      {
         while(i<s2)
         {
            output += you.charAt(i) + "" + me.charAt(i);
            i++;
         }
         while(i<s1)
         {
            output += you.charAt(i);
            i++;
         }
      }     
      if(s2>=s1)
      {
         while(i<s1)
         {
            output += you.charAt(i) + "" + me.charAt(i);
            i++;
         }
         while(i<s2)
         {
            output += me.charAt(i);
            i++;
         }
      }     
      return output;
   }
}