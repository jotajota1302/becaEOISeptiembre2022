package edu.es.eoi.service;

import edu.es.eoi.dao.ClienteDaoJPAImpl;
import edu.es.eoi.entity.Cliente;
import edu.es.eoi.entity.Cuenta;

public class ClienteService {
	
	ClienteDaoJPAImpl dao= new ClienteDaoJPAImpl();

	public double getSaldoTotal(Cliente cliente) {
		
		double total=0;
		
		for (Cuenta cuenta : cliente.getCuentas()) {
			total=total+cuenta.getSaldo();
		}		
		
		return total;
	}
	
	public Cliente readCliente(String dni) {
		
		return this.dao.read(dni);
	}
	
}
