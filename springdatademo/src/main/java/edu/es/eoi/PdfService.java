package edu.es.eoi;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class PdfService {
	
	private String version;
	
	private String year;
	
	public void convert(String text) {
				//generate PDF
		System.out.println("genero un PDF");
		
	}
}
