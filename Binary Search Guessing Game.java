import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long low = in.nextLong();
    long high=in.nextLong();
    long secretNum=in.nextLong();
    guesses(low,high,secretNum);
        
  }
        
  public static void guesses(long low, long high , long secretNum){
    if( (low+high)/2==secretNum)   {
      System.out.println(secretNum);
    return;
    }

    if(((high+low)/2)>secretNum){
      System.out.print((high+low)/2+" ");
      high=((high+low)/2)-1;
    }

    if(((high+low)/2)<secretNum){
      System.out.print((high+low)/2+" ");
      low=((high+low)/2)+1;
    }
    guesses(low,high,secretNum);
  }
}


