package SistemaBanco;

import java.util.Date;

public class Transaccion {
	private Date fecha;
	private float monto;
	private int nroCliente;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public int getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}
	public Transaccion(Date fecha, float monto, int nroCliente) {
		super();
		this.fecha = fecha;
		this.monto = monto;
		this.nroCliente = nroCliente;
	}
	@Override
	public String toString() {
		return "Transaccion [fecha=" + fecha + ", monto=" + monto + ", nroCliente=" + nroCliente + "]";
	}
	
}
