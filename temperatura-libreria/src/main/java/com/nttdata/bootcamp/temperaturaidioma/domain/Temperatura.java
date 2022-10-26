package com.nttdata.bootcamp.temperaturaidioma.domain;

public class Temperatura {
	private String medida;
	
	public Temperatura(String medida) {
		this.medida = medida;
	}
	
	public String mensajeSaludo() {
		String mensaje = "";
		switch(medida) {
		case "Celsius":
			mensaje = "1 grado celsius son 33,8 fahrenheit";
			break;
		case "Fahrenheit":
			mensaje = "1 grado Fahrenheit son -17,2222222 celsius";
			break;
		default:
			mensaje = "1 grado celsius son 33,8 fahrenheit";
			break;
		}
		return mensaje;
	}

	public String getTemperatura() {
		return mensajeSaludo();
	}

	public void setTemperatura(String medida) {
		this.medida = medida;
	}
	
	
		
}
