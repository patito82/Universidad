package SistemaBanco;

import java.util.Date;


public class CuentaBancaria {
	private int nroCuenta = 1;
	private Cliente titular;
	private float saldo;
	
	public void depositar(float monto) {
		this.saldo= monto;
	}
	public void extraer(float monto) {
		if(monto < this.saldo) {
				System.out.println("Extraccion Exitosa");
				setSaldo(saldo - monto);
		}else {
				System.out.println("Saldo insuficiente");
		}
	}
	
	
	public void transferir(float monto, CuentaCorriente cuenta) {}
	
	public int getNroCuenta() {
		return nroCuenta;
	}
	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
//	public CuentaBancaria(int nroCuenta, Cliente titular, float saldo) {
//		this.nroCuenta = nroCuenta;
//		this.titular = titular;
//		this.saldo = saldo;
//	}
	
}
