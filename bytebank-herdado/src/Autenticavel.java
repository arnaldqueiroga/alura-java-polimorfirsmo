// nossa Interface
// aqui n�s definimos um contrato, e esse contrato precisa ser assinado
// quem assina esse contrato, precisa implementar
// m�todo setSenha
// m�todo autentica

public abstract interface Autenticavel  {


	public abstract void setSenha(int senha);
	

	public abstract boolean autentica(int senha);
	

}
