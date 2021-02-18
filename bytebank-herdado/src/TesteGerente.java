
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Arnald");
		
		g1.setSenha(123456);
		
		boolean autenticou = g1.autentica(123456);
		
		System.out.println(autenticou);

	}

}
