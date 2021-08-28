
public class Administrador extends Funcionario implements Autenticavel {

	@Override
	public double getBonificacao() {
		return 50;
	}

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	private AutenticacaoUtil autenticador;

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {

		return this.autenticador.autentica(senha);

	}

}
