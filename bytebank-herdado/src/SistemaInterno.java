
public class SistemaInterno {

	private int senha = 222;

	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		
		if(autenticou == true) {
			System.out.println("pode entrar no sistema");
		}else {
			System.out.println("não pode entrar no sistema");
		}
	}

}
