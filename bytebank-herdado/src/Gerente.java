// gerente � um funcion�rio, gerente herda da class funcionario
public class Gerente extends Funcionario{
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}


	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else
			return false;
	}
	
	// utilizando o recurso de reaproveitar m�todos da super classe com supper
	public double getBonificacao() {
		return super.getSalario(); // super para indicar que � um atributo da classe m�e ou super classe
		
		// super.getSalario() - Significa que estamos acessando um m�todo private da classe m�e
		// atrav�s de seu membro da classe

	}

	
}
