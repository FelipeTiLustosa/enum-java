package Exemplo2;

import Exemplo1.TipoCliente_V1;
import Exemplo1.Cliente_V1.TipoPagamento;

public class Cliente_V2 {

private String name;
private TipoCliente_V1 tipoCliente;
// posso coloca ele assim caso esteja no msm pacote
TipoPagamento pagamento;


public Cliente_V2(String name, TipoCliente_V1 tipoCliente, TipoPagamento pagamento) {
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
