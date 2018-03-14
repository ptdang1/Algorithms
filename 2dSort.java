import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
     int n =kbd.nextInt();
      int ar[][]= new int[n][2];
      int i=0;
      while(i<n){
      int a = kbd.nextInt();
      int b = kbd.nextInt();
      ar[i][0]=a;
      ar[i][1]=b;
      i++;
      }
    System.out.println(  index(ar));

    }
         public static int  index(int[][]a){
       if (a.length ==0 && a[0].length==0)return 0;
       boolean isSorted =false;
   while(isSorted==false){
      isSorted=true;
          for(int i=0;i<a.length-1;i++){
                    if(a[i][0]>a[i+1][0]){
                  int temp = a[i][0];
                  a[i][0]= a[i+1][0];
                  a[i+1][0]=temp;
                  
                     int temp2 = a[i][1];
                  a[i][1]= a[i+1][1];
                  a[i+1][1]=temp2;
                  isSorted=false;
                  }
          }
       }
       int answer=0;
       if(a.length%2==0){
         int div = a.length/2;
         answer =( a[div][1]+a[div-1][1])/2;
       }
       else{
            int div = a.length/2;
            answer = a[div][1];
       }
       return answer;
    }

}
