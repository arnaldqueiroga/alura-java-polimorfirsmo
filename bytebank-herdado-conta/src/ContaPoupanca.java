// trabalhando com construtores pensando na heran�a, pois construtores n�o s�o
// herdados, mas o chamamos atrav�s do super
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca (int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

}
