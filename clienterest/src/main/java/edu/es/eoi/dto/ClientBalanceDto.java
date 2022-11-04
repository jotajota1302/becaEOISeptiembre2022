package edu.es.eoi.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientBalanceDto {
	
	private String dni;
	private double balance;
	private List<String> banks;

}
