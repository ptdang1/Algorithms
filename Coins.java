import java.util.Scanner;
public class Coins{
   public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter how many pennies: ");
      int pennies = input.nextInt();
      
      int dollars = pennies/100;
      pennies = pennies % 100;
      
      int quarters = pennies/25;
      pennies = pennies % 25;
      
      int dimes = pennies/10;
      pennies = pennies % 10;
      
      int nickles = pennies/5;
      pennies = pennies % 5;
      
      System.out.println("You have ");
      System.out.println("dollar(s) " + dollars);
      System.out.println("quarte(s) " + quarters);
      System.out.println("dimes(s) " + dimes);
      System.out.println("nickle(s) " + nickles);
      System.out.println("pennie(s) " + pennies);
   }
}