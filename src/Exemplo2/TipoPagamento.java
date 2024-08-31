package Exemplo2;

public enum TipoPagamento {
	CREDITO{
		@Override
		public double calculaDesconto(double valor) {
			return valor*0.1;
		}
	},
	DEBITO{
		@Override
		public double calculaDesconto(double valor) {
			return valor*0.05;
		}
	};
	
	// caso o metado for abstrato tenho q rescreve para os dois tanto credito como debito, caso ele nao for abstrato ñ precisa
	public abstract double calculaDesconto(double valor) ;
}

