package edu.es.eoi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.ClientBalanceDto;
import edu.es.eoi.dto.ClienteDto;
import edu.es.eoi.entity.Cliente;
import edu.es.eoi.entity.Cuenta;
import edu.es.eoi.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository repository;

	public ClienteDto find(String pk) {

		ClienteDto dto= null;
		
		Optional<Cliente> entity = repository.findById(pk);
		
		if(entity.isPresent()) {			
			dto=new ClienteDto();
			BeanUtils.copyProperties(entity.get(), dto);			
		}
				
		return dto;
	}

	private ClientBalanceDto convertToClientBalanceDto(ClientBalanceDto dto, Optional<Cliente> entity) {
	
		if(entity.isPresent()) {
			dto=new ClientBalanceDto();
			dto.setDni(entity.get().getDni());			
			
			double saldo=0;
			List<String> banks= new ArrayList<String>();
			for (Cuenta cuenta : entity.get().getCuentas()) {
				
				saldo=saldo+cuenta.getSaldo();		
				if(!banks.contains(cuenta.getBanco().getNombre())) {
					banks.add(cuenta.getBanco().getNombre());
				}				
			}			
			dto.setBalance(saldo);
			dto.setBanks(banks);
			
		}
		return dto;
	}

}
