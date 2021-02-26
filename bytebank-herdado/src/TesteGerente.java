
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Arnald");
		g1.setSalario(5000.0);
		
		g1.setSenha(123456);
		
		boolean autenticou = g1.autentica(123456);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
