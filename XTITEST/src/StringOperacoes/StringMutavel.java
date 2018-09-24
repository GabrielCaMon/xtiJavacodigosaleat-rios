package StringOperacoes;

public class StringMutavel {

	public static void main(String[] args) {
		
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		
		s1.toString();
		s1.length();
		System.out.println(s1.length());
		s1.capacity();
		System.out.println(s1.capacity());
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		s1.append(" Trabalho");
		System.out.println(s1);
		
		char [] c = {'c','o','m'};
		s1.append(c).append("meu ovo");
		System.out.println(s1);
		
		String s = "OI"+ "como"+"vai voce";
		String sb = new StringBuilder("OI").append("como").append("vai você").toString();
		
		
		String a = "10.22"; 
		double b =(int) 10.00;
		System.out.println(sb);
	}

}
