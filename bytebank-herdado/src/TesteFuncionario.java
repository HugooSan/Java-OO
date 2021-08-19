
public class TesteFuncionario {
	public static void main(String[] args) {
		
		
		Funcionario hugo = new Gerente();
		hugo.setNome("Hugo Shinde");
		hugo.setSalario(5000);
		
		Funcionario des = new Designer();
		des.setSalario(5000);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(hugo);
		
		System.out.println(controle.getSoma());
		
	}
}
