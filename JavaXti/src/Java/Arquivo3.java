package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import POO.Conta;

public class Arquivo3 {
	private Path path= Paths.get("C:/xti/files/contas.txt");
	private Charset utf8 = StandardCharsets.UTF_8;
	
	public void AccountsStorage(ArrayList<Conta> contas) throws IOException {
		
		
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
			for (Conta conta : contas) {
				w.write(conta.getCliente()+";"+ conta.getSaldo() +"\n");
			}}
		}
	
	public ArrayList<Conta> recoverAccounts() throws IOException{
		ArrayList<Conta> contas = new ArrayList<>();
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line = reader.readLine()) != null) {
				String [] t = line.split(";");
				//System.out.println(t[0]+t[1]);
				Conta conta = new Conta(t[0], Double.parseDouble(t[1]));
				contas.add(conta);
			}
		}
		return contas;
	}
	
	public static void main(String[] args)  throws IOException
	{
		/* ArrayList<Conta> contas = new ArrayList<>();
		
		 contas.add(new Conta("Marcos",1400.22));
		 contas.add(new Conta("Ricardo",1100.22));
		contas.add(new Conta("Maria",800.22));
		contas.add(new Conta("Marcia",666.22));
		 
		*/
		 Arquivo3 operacao = new Arquivo3(); 
		//operacao.AccountsStorage(contas);
		ArrayList<Conta> contas2 = operacao.recoverAccounts();
		for(Conta conta : contas2)
		 conta.exibirSaldo();
	}
}
