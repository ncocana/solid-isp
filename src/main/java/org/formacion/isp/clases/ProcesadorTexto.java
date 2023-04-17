package org.formacion.isp.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.formacion.isp.interfaces.ProcesadorBasico;
import org.formacion.isp.interfaces.ProcesadorComplejo;

public class ProcesadorTexto implements ProcesadorBasico, ProcesadorComplejo {

	private List<String> texto = new ArrayList<>();
	
	public void nueva (String palabra) {
		texto.add(palabra);
	}
	
	public String texto () {
		return texto.stream().collect(Collectors.joining(" "));
	}
	
	public boolean correcto (Idioma idioma) {
		for (String palabra: texto) {
			if (! idioma.diccionario.contains(palabra.toLowerCase())) {
				return false;
			}
		}
		return true;
	}

}
