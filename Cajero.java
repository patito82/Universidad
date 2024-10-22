package SistemaBanco;

public class Cajero {
	private Banco banco;
	
	public void validarCliente(String clave, int tarjeta) {}
	
	public void extraerDinero(float monto, Cliente cliente) {
		banco.extraer(monto,cliente);
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Cajero(Banco banco) {
		super();
		this.banco = banco;
	}
	
}
