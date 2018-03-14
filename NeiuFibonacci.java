import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static long FIB[]=new long[100];
    
    public static void main(String[] args) {
        for(int i=0;i<FIB.length;i++){
                 FIB[i]=(long)-1;
        }

    Scanner kbd = new Scanner(System.in);
    long n = kbd.nextLong();
    System.out.println(fib(n));
    }

    public static long fib(long n){
    if(n<=1)return n;
        if(FIB[(int)n]!=-1){
        return FIB[(int)n];
        }
        long F=fib(n-1)+fib(n-2);
        FIB[(int)n]=F;
        return F;
    }

}
