package SistemaBanco;

import java.util.ArrayList;
import java.util.Date;

public class Banco {
	private String nombre;
	private String codBanco;
	private ArrayList <Cliente> clientes= new ArrayList<>();
	private ArrayList <Transaccion> transacciones = new ArrayList<>();
	
	public void depositar(float monto) {}
	public void extraer(float monto, Cliente cliente) {
		if(clientes.contains(cliente)) {
			cliente.getCuenta().extraer(monto);
			Date fecha = new Date();
			Transaccion transaccion = new Transaccion(fecha,monto,cliente.getNroCliente());
			this.transacciones.add(transaccion);
		}
		
		
	}
	public void transferir(float monto, CuentaBancaria cuenta) {}
	public void pagoConCheque(float monto) {}
	public void generarTransaccion(Transaccion transaccion) {
		this.transacciones.add(transaccion);
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodBanco() {
		return codBanco;
	}
	public void setCodBanco(String codBanco) {
		this.codBanco = codBanco;
	}
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public void getTransaccion() {
		for(Transaccion transaccion : transacciones  ) {
			System.out.println(transaccion.toString());
		}
	}
	public Banco(String nombre, String codBanco) {
		super();
		this.nombre = nombre;
		this.codBanco = codBanco;
	}
	
	
}
