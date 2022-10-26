package com.nttdata.bootcamp.autoconfigure.temperatura;

import org.springframework.boot.context.properties.ConfigurationProperties;


import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("temperatura.medida")
@Getter
@Setter
public class TemperaturaProperties {
	
	private String temperatura = "Celsius";

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	

}
