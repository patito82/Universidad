package SistemaBanco;

public class Cliente {
	private int nroCliente;
	private int clave;
	private CuentaBancaria cuenta = new CuentaBancaria();
	
	public int getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public Cliente(int nroCliente, int clave) {
		super();
//		this.cuenta = cuenta;
		this.nroCliente = nroCliente;
		this.clave = clave;
	}
	public CuentaBancaria getCuenta() {
		return cuenta;
	}
	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}
	
	
}
