
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marcos");		
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();		
		controleBonificacao.registra(g1);
		controleBonificacao.registra(f);
		controleBonificacao.registra(ev);
		
		System.out.println(controleBonificacao.getSoma());
		
		

	}

}
