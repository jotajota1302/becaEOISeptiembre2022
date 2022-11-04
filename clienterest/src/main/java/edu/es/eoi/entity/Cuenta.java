package edu.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema="persona" ,name = "cuentas")
@Getter
@Setter
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
	
}
