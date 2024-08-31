package Exemplo1;

public enum TipoCliente_V1 {
	// forma de passa
	
	/*PESSOA_JURIDICA, 
	PESSOA_FISICA;*/
	
	// suponha q eu tenha um banco e eu tenho q mante os dados, caso no meu banco de dados
	// PESSOA_JURIDICA reprenta 1 e PESSOA_FISICA representa 2, na enum podem passa os valores assim 
	
	// tbm da pra passa valor como string
	PESSOA_JURIDICA(1,"Pessoa juridica"), 
	PESSOA_FISICA(2,"Pessoa fisica");

	public final int valor; // essa variavel nao poder vim antes  das enums, tem q vim sempre depois
	private String pessoa; // tbm posso passa assim 
	
	// quando vc passa os valores dentro vc esta chamando altomaticamente o contrusto, no caso vc tem q criar 
	// o construto na enumeracao e privado, vc nunca podera chama ele e quem chama ele e a enumeracao
	TipoCliente_V1(int valor, String relatorio) {
		this.valor=valor;
		this.pessoa=relatorio;
	}

	public String getPessoa() {
		return pessoa;
	}

	public int getValor() {
		return valor;
	}
	
	
}
