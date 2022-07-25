
public abstract class Conta implements Operacoes {
	private static final int AGENCIA = 1;
	private static int SEQUENCIAL = 1;
	
	private int numero;
	private int agencia;
	private double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}
	
	@Override
	public void transferencia(double valor, Operacoes contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}

	
	public void extrato() {
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Número: "  + this.numero);
		System.out.println("Saldo: " +  this.saldo);
	}
	
	
	

}
