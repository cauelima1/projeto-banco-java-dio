
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	public void imprimirExtrato() {
		System.out.println("==== Extrato Conta Poupanca ===");
		if (saldo < 0)
			System.out.println("Saldo esta negativo : R$" + saldo);
		imprimirInformacoesComuns();
	}

}
