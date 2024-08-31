package Exemplo3;

public class Teste_TipoCliente_V3 {
	public static void main(String[] args) {

		TipoCliente_V3 tipoCliente = TipoCliente_V3.valueOf("PESSOA_JURIDICA");
		System.out.println(tipoCliente);
		TipoCliente_V3 tipoCliente2 = TipoCliente_V3.tipoClienteNomeRelatorio("Pessoa juridica");
		System.out.println(tipoCliente2);
	}
}
