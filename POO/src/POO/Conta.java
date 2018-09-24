package POO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Conta {
	private String cliente;
	private Double saldo;
	
		
	public Conta(String cliente, Double saldo){
		this.cliente = cliente;
		this.saldo =  saldo;
	}
	
	Path pathAccounts = Paths.get("C:/xti/Accounts/listAccounts.txt");
	Charset utf8 = StandardCharsets.UTF_8;
	
	// Atributos Conta
	public void exibirSaldo(){
		System.out.println(cliente+ "seu saldo é" + saldo);
	}
	public void saca(double valor){
		saldo -= valor;
	}	
	public void deposita(double valor){
		saldo +=valor;
	}
	public void TransferePara(Conta destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
	}
	
	//Metódos de Arquivo
	
	public void recordList(Conta list) {
	try(BufferedWriter write = Files.newBufferedWriter(pathAccounts, utf8)){
		write.write("/n/n");
		write.write(list.cliente+"/n");
		write.write(list.saldo+"/n");
		write.write("/n/n");
	}catch(IOException e){
		e.printStackTrace();
	}
	}
	
	public void readList() {
		try(BufferedReader reader = Files.newBufferedReader(pathAccounts, utf8)){
			String line = null;
			while((line = reader.readLine())!= null) {
				System.out.println(line);
		}}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	//get e set
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
}
