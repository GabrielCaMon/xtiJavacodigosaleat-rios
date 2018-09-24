package StringOperacoes;

public class StringOperacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String s1 = "write Once";
				String s2= s1 + "Run AnyWhere";
				String s3 = new String ("Java Virtual Machine");
				char [] array = {'J','a','v','a'};
				String s4 = new String (array);
				
				//OPERAÇÕES
				int tamanho = s1.length();
				char letra = s1.charAt(0);
				String texto = s1.toString();
				
				//LOCALIZAÇÃO
				
				int posicao = s3.indexOf("Virtual");
				int ultima = s3.lastIndexOf('a');
				boolean vazia = s3.isEmpty();
				             
				System.out.println(posicao);
				
				//COMPARACAO
				String xti = "XTI";
				//boolean x = xti.equals("xti");
				//boolean x = xti.equalsIgnoreCase("xti");
				//boolean x = xti.startsWith("xt");
				boolean x = xti.endsWith("XTI");
				System.out.println(x);
				
				int c = "amor".compareTo("bola");//-1
				int c2 = "bola".compareTo("amor");//1
				int c3 = "amor".compareTo("amor");//0
				System.out.println(c);
				
				String so = "Olhe, olhe";
				boolean o = so.regionMatches(6, "olhe", 0, 4);
				
				System.out.println(o);
				
				
				String l = "O Brasil é lindo";
				String sl = l.substring(11);
				// sl = l.substring(2,8);
				
			sl = l.concat(" Que Maravilha");
			//sl = l + " que maravilha";
			
			sl = l.replace('s', 'z');
			//sl = l.replaceFirst(" ", "X");
			//sl = l.replaceAll(" ", "X");
			sl = l.toUpperCase();
			sl = l.toLowerCase();
			System.out.println(sl);
			
			System.out.println("     espaços     ".trim());
			
				
	}

}
