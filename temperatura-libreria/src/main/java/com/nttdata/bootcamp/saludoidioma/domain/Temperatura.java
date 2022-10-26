package com.nttdata.bootcamp.saludoidioma.domain;

public class Temperatura {
	private String medida;
	
	public Temperatura(String medida) {
		this.medida = medida;
	}
	
	public String mensajeSaludo() {
		String mensaje = "";
		switch(medida) {
		case "Celsius":
			mensaje = "Celsius";
			break;
		case "Farenheit":
			mensaje = "Farenheit";
			break;
		default:
			mensaje = "Celsius";
			break;
		}
		return mensaje;
	}

	public String getIdioma() {
		return medida;
	}

	public void setIdioma(String medida) {
		this.medida = medida;
	}
	
	
		
}
