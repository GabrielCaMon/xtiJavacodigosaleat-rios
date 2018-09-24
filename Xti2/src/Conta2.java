

public class Conta2 {
	
	private String cliente;
	private double saldo;
	
	
	public Conta2() {
		
	}
	
	public Conta2(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public void exibirSaldo(){
		System.out.println(cliente+ " seu saldo é " + saldo);
	}
	public void saca(double valor){
		saldo -= valor;
	}	
	public void deposita(double valor){
		saldo +=valor;
	}
	public void TransferePara(Conta2 destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
	}
	

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
