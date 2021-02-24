//não podemos mais instanciar objetos dessa classe, pq ela é abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	// abstract no método, significa que o método não tem corpo e nem implementação. 
	// Implementação é só nas classes filhas
	public abstract double getBonificacao();

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
