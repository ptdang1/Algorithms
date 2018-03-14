public class VowelConsonant {
   public static void main (String[] args){
   
      String x = "AAABBBCEEFFOOYU";
      String y = "HHHIIIMMEYYYAEIOU";
      System.out.println(vowelConsonant(x,y));
   }
   public static String vowelConsonant(String x, String y){
      
      String newString = "";
      String newString2 = "";          
          
      for(int i = 0; i < x.length(); i++){
         if( x.charAt(i) == 'A' || x.charAt(i) == 'E' || x.charAt(i) == 'I'|| x.charAt(i) == 'O'|| x.charAt(i) == 'U'){
            newString += x.charAt(i);
         }
      }
      for(int j = 0; j < y.length(); j++){
         if( y.charAt(j) != 'A' && y.charAt(j) != 'E' && y.charAt(j) != 'I' && y.charAt(j) != 'O' && y.charAt(j) != 'U'){
            newString2 += y.charAt(j);
         }  
      }
      return (newString + newString2);   
   }
}