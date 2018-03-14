import java.io.*;
import java.util.*;

public class mostFrequentValue {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  
        int[] A = new int[n];
        int count = 0;
        
        for(int i =0; i<A.length;i++){
            A[i]=input.nextInt();
        }
        
        int mostFrequent= A[0];
        int maxCount = 0;
        
        for(int i = 0; i < A.length; i++){
            count=0;
            for(int j =0; j< A.length;j++){
                if(A[i]==A[j])
                    count++;
            }
            if(count > maxCount)
            {
                maxCount = count;
                mostFrequent=A[i];
            }
        }
        System.out.println(mostFrequent);
    }
}