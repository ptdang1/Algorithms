//a = G A T C D R
//b = G B C R T D R

public class LCS{
	public static void main(String[]args){
		int sz=28;
		String a ="BZTCDR";
		String b ="ABCRTDR";
		String chars="GATC";
		String[][] memo= new  String[sz+1][sz+1];
		for(int i =0; i<sz;i++){
			a=a+chars.charAt((int)Math.random()*chars.length());
			b=b+chars.charAt((int)Math.random()*chars.length());
		}
		String res=lcs(a,b,0,0);
		System.out.println(a+"\n"+b+"\n-------------\n"+res);
	}

	public static String lcs(String a,String b, int aIdx,  int bIdx){
		if(memo[aIdx]!=null)return memo[aIdx][bIdx];


		if(aIdx ==a.length() || bIdx ==b.length()){
			memo[aIdx][bIdx]=temp;
			return "";
		}

		if(a.charAt(aIdx) ==b.charAt(bIdx)){
			return a.charAt(aIdx)+  lcs(a,b,aIdx+1,bIdx+1);
		}
		String aTemp =lcs(a,b,aIdx+1,bIdx+1);
		String bTemp =lcs(a,b,aIdx,bIdx+1);
		if(aTemp.length()>=bTemp.length()){
			return aTemp;
		}
		else{
			return bTemp;
		}


	}

}