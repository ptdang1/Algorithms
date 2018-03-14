
public class Sudoku
{                         
   static boolean found;
   public static void main(String[] args)  throws Exception
   {
      Display disp = new Display(800, 800, new int[9][9]);
      for( int i=0; i<PuzzleData.puzzleList.length; i++ )
      {
         disp.data = PuzzleData.puzzleList[i];
         System.out.printf("*** Puzzle %d ***\n\n", (i+1));
         display(disp.data);       
         System.out.printf("\n\n*** Solution %d ***\n\n", (i+1));
         found = false;
         permute(disp.data, 0, 0);
      }
   }
      public static void display(int[][] a)
      {
         for( int i=0; i<a.length; i++ ) 
         {
            for( int j=0; j<a[i].length; j++ ) 
            {
               if( a[i][j] == 0 ) System.out.print( "_ ");
               else System.out.print( a[i][j] + " " );
            }
            System.out.println();
         }
         System.out.println( "-------------------------" );
      }
   public static boolean validSolution( int[][] a, int r, int c )
   {
      return true;
   }
   public static void permute( int[][] a, int r, int c ) throws Exception
   {
      if( found ) return;
      if( c >= a[r].length ) 
      {
         c = 0;
         r = r + 1;
      }
      if( r >= a.length )
      {
         if( validSolution( a, r, c ) )
         {
            display(a);
            found = true;
            return;
         }
      }
      if( a[r][c] != 0 ) 
      {
         permute( a, r, c+1 );
         return;
      }
      for( int v=1; v<=9; v++ )
      {
         a[r][c] = v;
         Thread.sleep(50);     
         if( promising( a, v, r, c ) )
         {
            permute(a, r, c+1);
         }
      }
      a[r][c] = 0;
   }   
   public static boolean promising( int[][] a, int v, int r, int c )
   {
      for( int t=0; t<a[r].length; t++ ) 
      {
         if( t == c ) continue;
         if( a[r][t] == v ) return false;
      }
      for( int t=0; t<a.length; t++ ) 
      {
         if( t == r ) continue;
         if( a[t][c] == v ) return false;
      }
      int rq = r / 3 * 3;
      int cq = c / 3 * 3;
      for( int i=0; i<3; i++ )
      {
         for( int j=0; j<3; j++ ) 
         {
            if( i + rq == r && j + cq == c ) continue;
            if( a[i + rq][j + cq] == v ) return false;
         }      
      }
      return true;
   }
}