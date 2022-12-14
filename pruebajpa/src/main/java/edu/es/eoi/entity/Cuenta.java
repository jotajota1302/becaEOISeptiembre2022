package edu.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema="persona" ,name = "cuentas")
public class Cuenta {

	@Id
	private int id;
	
	@Column(name = "saldo")
	private double saldo;

	@ManyToOne
	@JoinColumn(name = "dni", referencedColumnName = "dni")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "idbanco", referencedColumnName = "id")
	private Banco banco;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	
}
