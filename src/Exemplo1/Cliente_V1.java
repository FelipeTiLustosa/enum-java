package Exemplo1;

public class Cliente_V1 {
	
	//Posso coloca ele dessa forma tbm, caso ele esta no msm pacote, sujerido q seja divido em class
public enum TipoPagamento{
		CREDITO,
		DEBITO;
}
private String name;
private TipoCliente_V1 tipoCliente;
// posso coloca ele assim caso esteja no msm pacote
TipoPagamento pagamento;


public Cliente_V1(String name, TipoCliente_V1 tipoCliente, TipoPagamento pagamento) {
	this.name = name;
	this.tipoCliente = tipoCliente;
	this.pagamento = pagamento;
}


@Override
public String toString() {
	return "Cliente_V1 [name=" + name + ","
			+ " tipoCliente=" + tipoCliente + ","
			+ " tipoClienteInt=" + tipoCliente.valor + "," 
			+ " tipoClienteRelatorio=" + tipoCliente.getPessoa() + "," 
					+ " pagamento=" + pagamento + "]";
}




}
