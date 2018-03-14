import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CoinChange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // your code goes here
        int num = in.nextInt();
        int pennies = num;
      
        int quarters = pennies / 25;
        pennies = pennies % 25;
        
        int dimes = pennies / 10;
        pennies = pennies % 10;
        
        int nickels = pennies / 5;
        pennies = pennies % 5;
        
        if(quarters == 1)
            System.out.println(quarters +" quarter");
        if(quarters > 1)
            System.out.println(quarters +" quarters");
        
        if(dimes == 1)
            System.out.println(dimes +" dime");
        if(dimes > 1)
            System.out.println(dimes +" dimes");
        
        if(nickels == 1)
            System.out.println(nickels +" nickel");
        if(nickels > 1)
            System.out.println(nickels +" nickels");
        
        if(pennies == 1)
            System.out.println(pennies +" penny");
        if(pennies > 1)
            System.out.println(pennies +" pennies");
    }
}