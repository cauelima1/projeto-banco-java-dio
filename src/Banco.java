import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Cliente> contasList = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public List<Cliente> getContas() {
		return contasList;
	}

	public void setContas(List<Cliente> contas) {
		this.contasList = contas;
	}
	
	
	
}
