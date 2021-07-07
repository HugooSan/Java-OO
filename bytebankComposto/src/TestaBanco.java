
public class TestaBanco {
	public static void main(String[] args) {
		
		Cliente hugo = new Cliente();
		hugo.nome = "Hugo Shinde";
		hugo.cpf = "123.456.789-10";
		hugo.profissao = "futuro programador";
		
		Conta contaHugo = new Conta();
		contaHugo.deposita(100);
		
		contaHugo.titular = hugo;
		
		System.out.println(contaHugo.titular.nome);
		System.out.println(contaHugo.titular);
		System.out.println(hugo);
		
	}
}
