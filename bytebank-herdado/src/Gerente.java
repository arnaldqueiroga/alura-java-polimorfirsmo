// Gerente é um funcionário, Gerente herda da classe Funcionário, e assina o 
// contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	 public Gerente() {
		 this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
		
	

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);		 
		
	}
	
	// utilizando o recurso de reaproveitar métodos da super classe com supper
	public double getBonificacao() {
		return super.getSalario(); // super para indicar que é um atributo da classe mãe ou super classe
		
		// super.getSalario() - Significa que estamos acessando um método private da classe mãe
		// através de seu membro da classe

	}

	
}
