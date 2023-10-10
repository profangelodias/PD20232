package tech.angelofdiasg.contas;

public class Conta {
	protected int numero;
	protected double saldo;
	
	boolean saque(double valor) {
		if(this.saldo > valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	boolean deposito(double valor) {
		return false;	
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	
	
}
