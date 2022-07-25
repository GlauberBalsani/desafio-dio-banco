
public interface Operacoes {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferencia(double valor, Operacoes contaDestino);

}
