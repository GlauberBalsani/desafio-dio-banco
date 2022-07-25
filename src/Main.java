
public class Main {

	public static void main(String[] args) {
		Cliente sami = new Cliente();
		sami.setNome("Samira");
		
		ContaEspecial contaEspecial = new ContaEspecial(sami);
		
		contaEspecial.depositar(1000);
		
		contaEspecial.extrato();
		
		

	}

}
