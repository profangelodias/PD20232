package tech.angelofdiasg.contas;

public class ContaInvestimento extends Conta {
	double taxa;
	int prazo;
	
	boolean saque(double valor) {
		if(this.saldo > valor) {
			this.saldo = this.saldo - (valor * 0.99);
			return true;
		} else {
			return false;
		}
	}
	boolean deposito(double valor) {
		//diferente de conta
		return false;	
	}
	
	double aplicaRendimento(double taxa) {
		return taxa;
		
	}

	public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
		super(numero, saldo);
		this.taxa = taxa;
		this.prazo = prazo;
	}
		
}

