package Exemplo2;

import Exemplo1.Cliente_V1;
import Exemplo1.TipoCliente_V1;
import Exemplo1.Cliente_V1.TipoPagamento;

public class Teste_TipoCliente_V2 {

	public static void main(String[] args) {
		Cliente_V1 cliente1= new Cliente_V1("Felipe", TipoCliente_V1.PESSOA_FISICA,Cliente_V1.TipoPagamento.DEBITO);
		//posso passa o TipoPagamento que esta na class Cliente_V1 dessa forma caso tenha o import:
		Cliente_V1 cliente2= new Cliente_V1("Lucas", TipoCliente_V1.PESSOA_JURIDICA,TipoPagamento.CREDITO);
		
		System.out.println(cliente1);//quando eu passo o valor eu nao preciso me preocupa se o usuario passo 1
		//ou 2, mais sim q ele passo o tipo correto
		System.out.println(cliente2);
		
		System.out.println(Exemplo2.TipoPagamento.DEBITO.calculaDesconto(100));
	}

}
