import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int count=1;

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      long a=in.nextLong();
      long b=in.nextLong();
      countGuesses(a,b);
       System.out.println(count);
    }

    public static void countGuesses(long low, long high){
      if(low==high) return;
      low=((high+low)/2)+1;
      count++;
        
      countGuesses(low,high);
    }
}
