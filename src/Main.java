import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente caue = new Cliente();
		caue.setNome("Caue");
		
		Conta cc = new ContaCorrente(caue);
		Conta poupanca = new ContaPoupanca(caue);
	
		cc.depositar(500);
		cc.sacar(600);
		poupanca.depositar(100);
		poupanca.sacar(300);

	
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		

	}
}



