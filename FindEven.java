public class FindEven {
 
   public static void main (String[] arge){
      int[] a = {1, 4, 3, 2, 5, 6, 7, 8};
     
      System.out.println(findEven(a)); 
   }     
   public static int findEven(int[] a) {
      int evencount = 0;
            
      for( int i = 0 ;i < a.length ; i++){ 
         if(a[i] % 2 == 0){
            evencount++; 
            System.out.print(a[i] + " ");  
             
         }
      }       
      System.out.println("");
      return evencount;
   } 
}
