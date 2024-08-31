package Exemplo3;

public enum TipoCliente_V3 {
// como retorna um enum basiada em um dos atributos
// digamos q vc tem o nome do relatorio e vc tem uma string
// e vc q pega aquela enum com base na string como fazer isso
// agente poder fazer da seguite forma
		PESSOA_JURIDICA(1,"Pessoa juridica"),// no caso eu tenho essa string e eu quero retorna essa enum q representa ela  
		PESSOA_FISICA(2,"Pessoa fisica");

		public int valor; 
		private String nomeRelatorio; 
		
		TipoCliente_V3(int valor, String nomeRelatorio) {
			this.valor=valor;
			this.nomeRelatorio=nomeRelatorio;
		}
		
		public static TipoCliente_V3 tipoClienteNomeRelatorio(String nomeRelatorio) {
			for (TipoCliente_V3 tipoCliente : values()) {
				if (tipoCliente.getnomeRelatorio().equals(nomeRelatorio)) {
					return tipoCliente ;
				}
			}
			return null;
		}
		String getnomeRelatorio() {
			return nomeRelatorio;
		}

		public int getValor() {
			return valor;
		}
		
		
}
