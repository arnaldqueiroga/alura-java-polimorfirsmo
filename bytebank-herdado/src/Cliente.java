
// implements significa que estou assinando, implementando o que o "contrato" definiu
public class Cliente implements Autenticavel {
	
	
	private AutenticacaoUtil autenticador;
	
	// pra fazer uso da interface, eu crio um construtor padrão, e dentro do escopo dele eu crio 
	// uma instancia da interface, que no caso é a classe AutenticacaoUtil
	public Cliente() {
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


	
	}




