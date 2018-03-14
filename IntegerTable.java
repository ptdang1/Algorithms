//Kenneth Johnson
//Homework 5
//10/2/15

import java.util.Scanner;
   public class IntegerTable {
      public static void main (String[] args) {
   
      Scanner input = new Scanner(System.in);                 
      int i; 
      double n;
      int ncount; 
      int pcount;
      int sum;
      double avg;          
                               
      System.out.print("Enter an integer, the input ends if it is 0:  ");
      i = input.nextInt();
                                 
      pcount=0;
      ncount=0;
      n=0;
      sum=0;
      avg=0;
                      
      while (i !=0) {
       if (i < 0) {     
          ncount = ncount + 1;
      }                    
       else {  
          pcount = pcount + 1;
      }                              
        sum = sum + i;
        System.out.print("Enter an integer, the input ends if it is 0:  ");
        i = input.nextInt();                                       
        n++;        
      }
                
         if (n !=0) {
            avg = (sum / n);
         }
         System.out.println("The number of positives is   " + pcount);
         System.out.println("The number of negatives is   " + ncount);
         System.out.println("The total is " + sum);
         System.out.println("The average is   " + avg);

         
      }
}