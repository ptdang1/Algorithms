//Phu Dang
//CS207 Fall 2016
//Assignment 1

public class rotateArray{
   public static void main(String[]args){
   
   
      int [] [] a = { { 3, 5, 7},
                    { 2, 4, 1},
                    { 4, 6, 8} };
         
      int [] [] b = rotateArray(a);
      //System.out.println(b);
   
      for(int row = 0; row < b.length; row++)
      {       
         for(int col = 0; col < b[row].length; col++)
         {       
            System.out.print(b[row][col] + "\t");
         }
         
         System.out.println();
      }

   }
   public static int [] [] rotateArray(int [] [] a){
      int [] [] b = new int [a.length][a[0].length];
      int row = 0;
      int col =0;
      int newRow = 0;
      int newCol = 0; 
      
      for(row = 0; row < b.length; row++)
      {       
         newCol = 0;
         for(col = b.length -1 ; col >= 0; col--)
         {       
            b[newRow][newCol] = a[col][row];
            newCol++;
         }
         newRow++;
         System.out.println();
      } 
      return b;
     
   }
   
}

/*
int [] [] a = { { 3, 5, 7},            
                { 2, 4, 1},
                { 4, 6, 8} };
                
rotateArray(a) returns: { { 4, 2, 3},            
                          { 6, 4, 5},
                          { 8, 1, 7} };
*/
      
   
