
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	// sobreescrevendo o método saca da classe Cliente para aproveitamento do método
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;		
		return super.saca(valorASacar);
	}

}
