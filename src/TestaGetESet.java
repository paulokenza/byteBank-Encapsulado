
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
	
	
	Cliente paulo = new Cliente();
	paulo.setNome("paulo silveira");
	
	conta.setTitular(paulo);
	
	System.out.println(conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("Programador");
	
	Cliente titularDaConta = conta.getTitular();
	titularDaConta.setProfissao("programador");
		}		

}
