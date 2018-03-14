import java.util.Scanner;
 
public class QuickSort 
{

     public static void main(String[] args)
    {
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int [n];
        
        for(int i =0; i < arr.length; i ++){
            arr[i] = input.nextInt();
        }
        
        
        int min =0;
        int max =0;
        for(int j =0; j < arr.length; j ++){
            if(arr[j] >= arr[0])
                max++;
            else
                min++;
        }
        if(min>max)
            System.out.println("Not working");
        else
            System.out.println("Possibly working");


    }    
}