
public class TesteFuncionario {
	public static void main(String[] args) {
		
		
		Gerente hugo = new Gerente();
		hugo.setNome("Hugo Shinde");
		hugo.setSalario(5000);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(hugo);
		controle.registra(f);
		
		System.out.println(controle.getSoma());
		
	}
}
