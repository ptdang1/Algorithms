public class MostFrequentValue2{
   public static void main(String[] args){
   
      int[] myarray = {81, 81, 39, 17, 39, 17, 17, 17, 81, 81, 39, 5, 39, 39};
      
      System.out.println( "The number that appears the most is: " + mostFrequentValue(myarray) ); 
   }
   public static int mostFrequentValue(int[] myArray){
   
      int maxCount = 0;
      int maxValue = -1;
      int count = 0;
      
      for( int i = 0; i < myArray.length; i++ ){
         for( int j = 0; j < myArray.length; j++ ){
            if( myArray[i] == myArray[j] ){
               count++;
            }
         } 
         if( count > maxCount ){
         
            maxCount = count;
            maxValue = myArray[i];
         }
      }
      return maxValue;
   }  
}