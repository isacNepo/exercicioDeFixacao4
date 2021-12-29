package entities;

public class Account {
	
	private int conta;
	private String titular;
	private double saldo;
	
	public Account (int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}
	
	public Account (int conta, String titular, double depositoInicial) {
		this.conta = conta;
		this.titular = titular;
		saldo =  depositoInicial;
	}

	public int getConta() {
		return conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void saque(double valorSaque) {
		saldo -= (valorSaque + 5.00);
	}
	
	public String toString() {
		return "conta " + conta + ",titular: " + titular + ", Saldo: $ " + String.format("%.2f", saldo);
	}
}
