// gerente é um funcionário, gerente herda da class funcionario
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
	
	// utilizando o recurso de reaproveitar métodos da super classe com supper
	public double getBonificacao() {
		return super.getSalario(); // super para indicar que é um atributo da classe mãe ou super classe
		
		// super.getSalario() - Significa que estamos acessando um método private da classe mãe
		// através de seu membro da classe

	}

	
}
