import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner kbd = new Scanner(System.in);
      int f = kbd.nextInt();
      String t="";
      fib(f,t);
    }
    public static int fib(int n ,String t){
      if(n<=1){
      System.out.println(t+"fibonacci("+n+")");
      t="";
      return n;
      }
      else{
      System.out.println(t+"fibonacci("+n+")");
      t+="  ";
      }
    return fib(n-1,t)+fib(n-2,t);
    }
}