
public class IsSubString{
   public static void main (String[] args){
   
      String a2 = "abcdef";
      String b2 = "cde";
      System.out.println(isSubString(a2,b2));
   }
   public static boolean isSubString(String a, String b){
      if( a.length() < b.length()){
         return false;
      }
      int bPos = 0;   
      for( int  i= 0; i < a.length(); i++ ){
         if( bPos == b.length()) 
            return true;
            
         if( a.charAt(i) == b.charAt(bPos)){
            bPos++;
            if( bPos == b.length()){
               return true;
            }   
         }      
         else{
            bPos = 0;
         }
      }
      return false;
   }
}