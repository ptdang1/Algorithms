import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int l = kbd.nextInt();
        int i=0;
        int a[]=new int[l];
        while(i<l){
            //int x=
            a[i]=kbd.nextInt();
            i++;
        }
        isParted(a);
    }

    public static void isParted(int a[]){
      
        int mid =a.length/2;
        int i=0,j=mid;
        boolean partA=true,partB=true;
        while(i<mid ){
            if(a[i]>a[mid])
            partA=false;
            i++;
        }
        while(j<a.length ){
            if(a[i]<a[mid])
            partB=false;
            j++;
         }
        if(partA==true && partB==true)
            System.out.println("Possibly working");
        else
            System.out.println("Not working");

    }

}
