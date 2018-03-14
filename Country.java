//Phu Dang
//CS207 Fall 2016
//Assignment 2

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Country {
   //data members
   private String name;
   private int pop;
   private String capital;
   
   //constructors(can not have a return of value
   public Country(String name, int pop, String capital){
      this.name = name;
      this.pop = pop;
      this.capital =capital;
   }
   
   //get and set method
   
   public void setName(String name){
      this.name = name;
   }
   
   public void setPopulation(int pop){
      this.pop = pop;
   }
   
   public void setCapital(String capital){
      this.capital = capital;
   }
   
   public String getName(){
      return (this.name);
   }
   
   public int getPopulation(){
      return (this.pop);
   }
   
   public String getCapital(){
      return (this.capital);
   }
   
   //toString method
   @overide
   public String toString(){
      return("name" + this.name + "\t population: " + this.pop +
            "capital: " + this.capital);
            
   }
   
}