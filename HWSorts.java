import java.util.Arrays;

public class HWSorts
{
   static int[] sizes = {20, 100, 500, 1000, 2000, 5000, 10000, 20000, 40000, 65000, 100000, 120000, 130000, 140000, 200000, 500000, 1000000};  
   public static void main(String[] args)
   {
      int sIdx = 0;
      long startTime;
      long endTime;
      double time;
      while( sIdx < sizes.length ) 
      {
         int[] A = new int[sizes[sIdx]];
         int[] B = new int[sizes[sIdx]];  
         int[] C = new int[sizes[sIdx]]; 
         int[] D = new int[sizes[sIdx]]; 
         int[] E = new int[sizes[sIdx]]; 
         for( int i=0; i<A.length; i++ ) 
         {
            A[i] = (int)(Math.random()*sizes[sIdx]*2);
            B[i] = A[i];
            C[i] = A[i];
            D[i] = A[i];
            E[i] = A[i];
         }
         //System.out.println( Arrays.toString(A) );
         System.out.println( "----------------\nSize = " + C.length);
         startTime = System.nanoTime();         
         C = mergeSort(C);         
         endTime = System.nanoTime();
         time = (endTime - startTime) / 1000000000.;
         System.out.println( "Merge sort finished - time = " + time  + " seconds.");
         System.out.println( "Starting bubble sort!" );
         //System.out.println( Arrays.toString(C) );
         startTime = System.nanoTime();
         bubbleSort(B);
         endTime = System.nanoTime();
         time = (endTime - startTime) / 1000000000.;
         System.out.println( "Bubble sort finished - time = " + time  + " seconds." );
         //System.out.println( Arrays.toString(B) );
         System.out.println( "Starting java's Array sort!" );
         //System.out.println( Arrays.toString(C) );
         startTime = System.nanoTime();
         D = javaSort(D);
         endTime = System.nanoTime();
         time = (endTime - startTime) / 1000000000.;
         System.out.println( "Java's Array sort finished - time = " + time  + " seconds." );
         System.out.println( "Starting QuickSort!" );
         //System.out.println( Arrays.toString(C) );
         startTime = System.nanoTime();
         E = quickSort(E);
         endTime = System.nanoTime();
         time = (endTime - startTime) / 1000000000.;
         System.out.println( "QuickSort finished - time = " + time  + " seconds." );
         sIdx = sIdx + 1;   
      }
   }  
   
   public static void bubbleSort(int[] A)
   {
      //write your BubbleSort method here
      for(int i=0; i<A.length;i++){
         for(int j=1; j<A.length;j++){
         
            if(A[j] <A[j-1]){
               int t= A[j];
               A[j] =A[j-1];
               A[j-1]=t;
            }
         }
      }
   
   }
   public static int[] mergeSort(int[] X)
   {
      //mergeSort method - you need to return
      // a reference to the newly built array
      if(X.length<=1)return X;
      
      int[]L =new int[X.length/2];
      int[]R =new int[X.length - L.length];
      
      for(int i=0; i<X.length;i++){
         if(i<L.length) L[i]=X[i];
         else R[i-L.length] = X[i];
      }
      L =mergeSort(L);
      R =mergeSort(R);
      X =merge(L,R);
      return X;
 
   }
   private static int[] merge(int[] a, int[] b)
   {
      //create an array of size A.len + B.len
      // blend the two arrays together into one
      //  sorted array and return
        int [] r = new int[a.length + b.length];
        int aIdx=0;
        int bIdx=0;
        int rIdx=0;
        
        int i=0;
        while(i<r.length){
            
            if(aIdx>=a.length){
                r[i]=b[bIdx];
                bIdx++;
            }
            else if(bIdx>= b.length){
                r[i]= a[aIdx];
                aIdx++;
            }
            else if(a[aIdx]< b[bIdx]){
                r[i]= a[aIdx];
                aIdx++;
            }
            else{
                r[i]= b[bIdx];
                bIdx++;
            }
            
            i++;
        }
        return r;
   }
   public static int[] javaSort(int[] X)
   {
      //use java's Array class to sort X
      Arrays.sort(X);
      return X;
   }
   public static int[] quickSort(int[] X)
   {
      //quicksort doesn't create a new array
      //  so we need additional params for our 
      //  recursive method
      
      return quickSort(X, 0, X.length-1);   
   }
   public static int[] quickSort(int[] X, int s, int e)
   {
   	if(e <= s) return X;
   	int pivot = Partition(X, s, e);
   	quickSort(X, s, pivot-1);
   	quickSort(X, pivot+1, e);
    return X;
   }
   public static int Partition(int[] X, int s, int e){
   	int pivot =s;
   	for(int i=s+1;i<e;i++){
   		if(X[i] < X[s]){
   			pivot++;
   			int t = X[i];
   			X[i] =X[pivot];
   			X[pivot] = t;
   		}	
   	}
   	int t =X[pivot];
   	X[pivot] =X[s];
   	X[s] =t;
   	return pivot;
   
   }
   
}