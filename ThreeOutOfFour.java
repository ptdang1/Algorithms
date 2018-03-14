public class ThreeOutOfFour{
   public static void main (String[] args){
   
      int a = 27;
      int b = 20;
      int c = 34;
      int d = 20;
   
      System.out.println(threeOutOfFour(a, b, c, d));
   }
   public static boolean threeOutOfFour(int a, int b, int c, int d){
      if( a == b && b == c ) 
      {
         return true;
      }
      else if( a == b && b == d )
      {
         return true;
      }
      else if( a == c && c == d )
      {
         return true;
      }
      else if( b == c && c == d )
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}