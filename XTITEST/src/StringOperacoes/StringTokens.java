package StringOperacoes;

public class StringTokens {
	static String  sa="";
 public static void main(String[] args) {
	
	 String s = "XHtml; CSS; Java";
	 String[] tokens = s.split(";");
	 System.out.println(tokens.length + " tokens");
	 
	 for (String token : tokens) {
		 
		
		 sa += token;
		
	}
	 System.out.println(sa);
			 
}
}
