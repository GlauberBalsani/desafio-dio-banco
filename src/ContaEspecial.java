
public class ContaEspecial extends Conta {
	private double limite = 500;
	
	
	public ContaEspecial(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public double getLimite() {
		return limite;
	}
	
	@Override
	public void extrato() {
		System.out.println("Extrato Conta Especial:");
		super.extrato();
		System.out.println("Limiete Especial: " + this.limite);
		System.out.println("Saldo especial " + (this.limite + getSaldo()));
	}

}
