public class CommonElement{
   public static void main(String[] args){
   
      int[] x = {99, 85, 71, 999, 67};
      int[] y = {55, 10, 998, 22};
      int[] z = {33, 56, 44, 11, 15, 85};
   
      System.out.println(commonElement(y, z));
      System.out.println(commonElement(x,y));
   }
   public static boolean commonElement(int[] a, int[] b) {
   
   
      for(int i = 0; i < a.length; i++){
         for(int j = 0; j  < b.length; j++){
            if(a[i] == b[j])
               return true;
         }
      }
   
      return false;
   }
}