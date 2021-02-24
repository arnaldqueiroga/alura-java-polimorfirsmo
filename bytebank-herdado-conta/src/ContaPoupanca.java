// trabalhando com construtores pensando na herança, pois construtores não são
// herdados, mas o chamamos através do super
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca (int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

}
