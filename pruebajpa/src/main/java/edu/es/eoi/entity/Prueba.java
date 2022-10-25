package edu.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "persona", name = "prueba")
public class Prueba {
	
	@Id
	private int id;
	
	@Column
	private String campo1;
		
	@Column
	private String campo2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampo1() {
		return campo1;
	}

	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}

	public String getCampo2() {
		return campo2;
	}

	public void setCampo2(String campo2) {
		this.campo2 = campo2;
	}
	
	

}
