public class sortBy{
   public static void main(String[] args){
      int[][] arr = { {23, 55, 12, 99, 7},
                     {4, 45, 52, 62, 34},
                     {58, 76, 24, 8, 86},
                     {15, 9, 36, 26, 11},
                     {75, 26, 3, 53, 44}};
      int c = 3;
      sortByColumn(c, arr);  
                    
   }
   public static void sortByColumn(int c, int [][] A){
     int [] temp;
     for(int i = 0; i < A.length; i ++){
         for(int j = i +1; i < A.length; j++){
            if(A[i][c] > A[j][c]){
               temp = A[i];
               A[i] = A[j];
               A[j] = temp;
            }
         }
     }
               
            
   }
}