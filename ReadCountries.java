//Phu Dang
//CS207 Fall 2016
//Assignment 2
import java.util.*;
import java.io.File;
import java.util.ArrayList;


   public class ReadCountries
   {
   
      public static void main (String[]args) //throws Exception
      {
         
      String name = "";
      String population = ""; 
      String capital = "";
      String maxName = "", minName = "";
      int pop = 0, maxPop=0, minPop=0;
      
      
      ArrayList <Country> countries = new ArrayList <Country>();
            
      try
      {
         Scanner fScan = new Scanner (new File("Countries2.txt"));
         
         
         while(fScan.hasNext())
         {
         
         name = fScan.next(); 
         //population = fScan.next(); 
         pop =fScan.nextInt(); //Integer.parseInt(population); 
         capital = fScan.next();
         Country c1 = new Country(name, pop, capital); 

         countries.add(c1);
         
         if(maxPop<c1.getPop())
         {
         maxName=c1.getName();
         maxPop=c1.getPop();
         minPop=c1.getPop();
         }
         if(minPop>c1.getPop())
         {
         minName=c1.getName();
         minPop=c1.getPop();      
         }
         
         
   
         }
       }
      catch(Exception e) 
      {
      System.out.println("No File");
      }
      for(int i=countries.size()-1;i>=0;i--)
      {
      System.out.println(countries.get(i));     
      }
      System.out.println("The country with the largest population is: "+maxName+", Population: " +maxPop);
      System.out.println("The country with the smallest population is: "+minName+", Population: " +minPop); 
     }
   }
