
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 1111);
		cc.deposita(100);
		
		SeguroDeVida sv = new SeguroDeVida();
				
		
		System.out.println("CC :"+cc.getSaldo());
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(sv);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
