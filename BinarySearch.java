public class BinarySearch {
 /** Use binary search to find the key in the list */
   public static void main (String[] arge){
      int[] list = {1, 2, 4, 20, 35, 39, 60, 62};
      System.out.println(binarySearch(list, 62)); 
   }
   public static int binarySearch(int[] list, int key) {
      int start = 0;
      int end = list.length - 1;
   
      while (end >= start) {
         int mid = (start + end) / 2;
         if (key < list[mid])
            end = mid - 1;
         else if (key == list[mid])
            return mid;
         else
            start = mid + 1;
      }
   
      return - 1; // Now end < start, key not found
   }
}
