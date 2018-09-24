package Java;

import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Expression {

	public static void main(String[] args) {

		//String padrao = "Java";
		//String texto = "Java";
		//boolean b = texto.matches(padrao);
		
		//padrão é igual a texto?
		//boolean b = "Java".matches("Java");
		
		
		/*
		 * (?i),Ignora maiúscula e minúscula
		 * (?x), Comentários
		 * (?m),Multilinhas
		 * (?s),Dottal
		 * */
		boolean b = "Java".matches("(?im)java");
		
		
		
		/*METACARACTERES
		 * . qualuqer caracter
		 * \d dígitos          [0-9]
		 * \D não é dígito     [^0-9]
		 * \s espaços          [ \t\n\x0B\f\r]
		 * \w letra            [a-zA-Z_0-9]
		 * \W não é letra
		 */
		 b = "o".matches(".");// um caracter
		 b = "2".matches("\\d");
		 b = "A".matches("\\w");
		 b = " ".matches("\\s");
		 
		 b = "PI".matches("..");//dois caracter
		 b = "PIa".matches("...");//tres caracter
		 b = "22".matches("\\d\\d");//dois digitos
		 
		 String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		 b= "70294-070".matches(cep);
		
		
		/*QUANTIFICADORES
		 * X{n}       X, exatamente n vezes
		 * X{n, }     X, pelo menos n vezes
		 * X{n, m}    X, pelo menos n mas não mais do que m vezes
		 * X?         X, 0 ou 1 vez
		 * X*         X, 0 ou + vezes
		 * X+         X, 1 ou + vezes
		 * */
		
		
		b = "21".matches("\\d{2}");
		b = "123".matches("\\d{2,}");
		b = "12345".matches("\\d{2,5}");
		
		b= "".matches(".?");//0 ou 1
		b = "ab".matches(".*");//0 ou +
		b= "".matches(".+");//1 ou +
		
		b= "70294-070".matches("\\d{5}-\\d{3}");
		b= "10/12/1998".matches("\\d{2}/\\d{2}/\\d{4}");
		
		/*	METACARACTER DE FRONTEIRA
		 *  ^ inicia
		 *  $ finaliza
		 *  | ou
		 * */
		b="Pier21".matches("^Pier.*");
		b="Pier21".matches(".*21$");
		b="tem java aqui".matches(".*java.*");
		b="tem java aqui".matches(".*^tem.*aqui$*");
		b="sim".matches("sim|não");
		
		/*AGRUPADORES
		 * [...]     		Agrupamento
		 * [a-z]	 		Alcance
		 * [a-e][i-u] 		União
		 * [a-z&&[aeiou]]   Interseção
		 * [^abc]			Exceção
		 * [a-z&&[^m-p]]	Subtração
		 * \x				Fuga literal
		 * */
		
		b="a".matches("[a-z]");
		b="3".matches("[0-9]");
		b="true".matches("true");
		b="true".matches("[tT]rue");//True true
		b="Yes".matches("[tT]rue|[Yy]es");
		b= "Beatriz".matches("[A-Z][a-z]*");
		b= "olho".matches("[^abc]lho");// não permite a,b,c
		b= "crau".matches("cr[ae]u");
		b= "rh@xti.com".matches("\\w+@\\w+\\.\\w{2,3}");
		//System.out.println(b);
		
		
		
		String doce = "Qual é o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while(matcher.find()) {
			//System.out.println(matcher.group());
		}
		
		//SUBSTITUIÇÕES
			String r= doce.replaceAll("(?i)doce", "DOCINHO");
			
			String rato= "O rato roeu a roupa do rei de roma";
			
			r= rato.replaceAll("r[a-u]", "XX");
			r = "Tabular este texto".replaceAll("\\s", "\t");
			//System.out.println(r);
			String url = "www.xti.com.br/clientes-2011.html";
					//http://xti.com.br/2011/clientes.jsp//Objetivo
				
			String re ="www.xti.com.br/\\w{2,}-\\d{4}.html";
			b=url.matches(re);
			System.out.println(b);
			
			re ="(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
			
			r = url.replaceAll(re, "http://$1/$3/$2.jsp");
			System.out.println(r);
	}

}
