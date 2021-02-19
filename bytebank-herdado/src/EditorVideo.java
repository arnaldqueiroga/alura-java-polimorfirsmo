// gerente é um funcionário, gerente herda da class funcionario
public class EditorVideo extends Funcionario{
	

	
	public double getBonificacao() {
		return super.getBonificacao() + 100; 

	}

	
}
