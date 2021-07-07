
public class TestaConta {
	
	public static void main(String[] args) {
		
		Conta contaTeste = new Conta();
		
		contaTeste.titular = new Cliente();
		
		contaTeste.titular.nome = "Nani?!?!?!?!?!?!";
		
		System.out.println(contaTeste.titular.nome);
		
	}
	
}
