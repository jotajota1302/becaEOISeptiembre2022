package edu.es.eoi.service;

import edu.es.eoi.entity.Cliente;
import edu.es.eoi.entity.Cuenta;

public class ClienteService {
	

	public static double getSaldoTotal(Cliente cliente) {
		
		double total=0;
		
		for (Cuenta cuenta : cliente.getCuentas()) {
			total=total+cuenta.getSaldo();
		}		
		
		return total;
	}
	
}
