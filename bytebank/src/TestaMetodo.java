
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
		conta.saca(150);
		System.out.println(conta.saldo);
		
		Conta contaTeste = new Conta();
		contaTeste.deposita(1000);
		
		contaTeste.transfere(300, conta);
		
		System.out.println(contaTeste.saldo);
		System.out.println(conta.saldo);
	}
}
