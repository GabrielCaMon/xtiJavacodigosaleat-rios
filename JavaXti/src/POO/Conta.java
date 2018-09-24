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
	private double saldo;
	
	
	
	public Conta(String cliente, double saldo){
		this.cliente = cliente;
		this.saldo =  saldo;
	}
	
	
	
	// Atributos Conta
	public void exibirSaldo(){
		System.out.println(cliente+ " seu saldo é " + saldo);
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
	
	

	
	
	//get e set
	public String getCliente() {
		return cliente;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	
}
