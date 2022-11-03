package edu.es.eoi;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class WordService {
		
	private PdfService service;
	
	public void convertToPDF(String wordFile) {
		
		//logica de como se hace esto
		
		//abrir el fichero, leer el contenidol y llamar al PdfService
		
		service.convert(wordFile);
		
		
	}

}
