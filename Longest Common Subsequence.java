import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int MEMO[][];
   public static void main(String[] args) {
        Scanner kbd=new Scanner(System.in);
        String a = kbd.nextLine();
        String b = kbd.nextLine();
       MEMO = new int [a.length()+1][b.length()+1];
        System.out.println(lcs(a,b,0,0));
    }
     public static int lcs(String a,String b, int i,int j){
      int x=-1;
      if(i==a.length()||j==b.length())return 0;
      if(MEMO[i][j]>0)return MEMO[i][j];
      
      if(a.charAt(i)==b.charAt(j)){
               x=1+lcs(a,b,i+1,j+1);
               MEMO[i][j]=x;
               return x;
               }
      if(a.charAt(i)!=b.charAt(j)){
         x=Math.max(lcs(a,b,i+1,j),lcs(a,b,i,j+1));
         MEMO[i][j]=x; 
         return x;
         }    
      return lcs(a,b,i,j);    
  
    } 


}
