// classe que desenvolve o Polimorfismo
public class ControleBonificacao {
	
	private double soma;
	

	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao(); // tipo de referência que pode apontar para mais de um objeto diferente
		this.soma = this.soma + boni;
		
	}
	
	
	
	public double getSoma() {
		return soma;
	}

}
