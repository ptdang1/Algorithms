//problem 6
public class aloneInRow{
   public static void main(String[]args){
   
   char [] [] a = { { 'a', grid, 3},
                   { 'b', grid, 3},
                   { 'f', grid, 3} };
                    
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
 

   public static int aloneInRow(char ch, char[] [] grid, int n){
   
   int row =0;
   int col= 0;
   n=0;
   for(row= 0; row < grid.length; row++){
   n=0;
      for(col =0; col < grid[row].length; col++){
         if(grid[row][col] == char){
         n++;
         }
      }
      if(n==1){
      return (row);
      }
       
   }
   return (-1);
   
   }

   
   
   }
}
