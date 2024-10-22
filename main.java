package SistemaBanco;

public class main {

	public static void main(String[] args) {
		Banco banco1 = new Banco("Bank", "2K");
		Cajero cajero1 = new Cajero(banco1);
		Cliente cliente1 = new Cliente(1,1);
		
		banco1.agregarCliente(cliente1);
		
		cliente1.getCuenta().depositar(1000);
		cajero1.extraerDinero(200, cliente1);
		System.out.println(cliente1.getCuenta().getSaldo());
		
	}

}
