import java.util.*;
public class InterLeave3{
   public static void main (String[] args){
            
      String s1 = "abcdefg";
      String s2 = "123445454545454554";
      
      String output = interleave(s1, s2);
      System.out.println(output);    
   }
   public static String interleave( String you, String me){
   
      String output = "";
      int i = 0;
       
      while( i < you.length() || i < me.length() ){
         if( i < you.length()){
            output += you.charAt(i);
         }
         if( i < me.length()){
            output += me.charAt(i);
         }
         i++;
      }
      return output;
   }
}