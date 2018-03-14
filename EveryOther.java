// Kenneth Johnson
// Homework 8
// 11/11/2015


import java.util.*;
public class EveryOther{
   public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter two words: ");
      
      String s1 = input.nextLine();
      String s2 = input.nextLine();
      
      String output = everOther(s1, s2);
      System.out.println(output);     
   }      
   public static String everOther(String s1, String s2)
   {
      int i = 0;
      int you = s1.length();
      int me = s2.length();
      String output="";      
   
      if(you>=me)
      {
         while(i<me)
         {
            output += s1.charAt(i) + "" + s2.charAt(i);
            i++;
         }
         while(i<you)
         {
            output += s1.charAt(i);
            i++;
         }
      }    
      if(me>=you)
      {
         while(i<you)
         {
            output += s1.charAt(i) + "" + s2.charAt(i);
            i++;
         }
         while(i<me)
         {
            output += s2.charAt(i);
            i++;
         }
      }   
      return output;     
   }
}