package tech.angelofdiasg.contas;

public class ContaEspecial extends Conta{
	double limite;
	
	boolean saque(double valor) {
		
		if(getSaldo() > valor) {
			setSaldo(getSaldo() - (valor * 0.90));
			return true;
		} else {
			return false;
		}
	}

	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}
	

}
