package org.formacion.isp.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.formacion.isp.interfaces.ProcesadorBasico;

public class ProcesadorTextoBasico implements ProcesadorBasico {

	private List<String> texto = new ArrayList<>();
	
	public void nueva (String palabra) {
		texto.add(palabra);
	}
	
	public String texto () {
		return texto.stream().collect(Collectors.joining(" "));
	}

}
