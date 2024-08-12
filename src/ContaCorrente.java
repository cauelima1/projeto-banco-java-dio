
public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	
	}

	public void imprimirExtrato() {
		System.out.println("==== Extrato Conta Corrente ===");
		if (saldo < 0)
			System.out.println("Saldo esta negativo : R$" + saldo);
		imprimirInformacoesComuns();
	}


	
	
}	
