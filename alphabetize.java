public class alphabetize{
   public static void main(String[]args){
   char [] [] a = { { 'f', 'r', 'a', 'c'},
                    { 'r', 's', 't', 'z'},
                    { 'k', 'e', 'm', 'v'} };
   
   alphabetize(a, 1, 1);  
   alphabetize(a, 0, 1);
   alphabetize(a, 2, 3);             
   }
   public static void alphabetize(char[][] a, int i, int j){
      String str = ""; 
      if(j > 0){
         str += a[i][j-1];     
      }
      if(i > 0){
         str += a[i-1][j];
      }
      if(j < a[i].length - 1){
         str += a[i][j+1];
      }
      if(i < a.length - 1){
         str += a[i+1][j];
      }
      
      System.out.print(str);
      System.out.println();
      
   }
}