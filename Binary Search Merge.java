import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
      int []arr = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=kbd.nextInt();
        }
        int b = kbd.nextInt();
        int []brr = new int[b];
        
        for(int j=0;j<brr.length;j++){
            brr[j] = kbd.nextInt();
        }
        merge(arr,brr);
    }
    
    public static void merge(int []arr,int []brr){
        int j=0;
        int []newArr = new int[arr.length+brr.length];
        for(int i =0;i<newArr.length;i++){
            if(i<arr.length){
              newArr[i]= arr[i];      
            }
            else{
                newArr[i]=brr[j];
                j++;
            }
        }
        sort(newArr);
    }

    public static void sort(int []arr){
        boolean isSorted=false;
        while (isSorted==false){
            isSorted=true;
            for(int i=1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    isSorted=false;
                }
            }
        }
        print(arr);
    }

    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" " );
        }
    }
}
