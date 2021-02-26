// Gerente � um funcion�rio, Gerente herda da classe Funcion�rio, e assina o 
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
	
	// utilizando o recurso de reaproveitar m�todos da super classe com supper
	public double getBonificacao() {
		return super.getSalario(); // super para indicar que � um atributo da classe m�e ou super classe
		
		// super.getSalario() - Significa que estamos acessando um m�todo private da classe m�e
		// atrav�s de seu membro da classe

	}

	
}
