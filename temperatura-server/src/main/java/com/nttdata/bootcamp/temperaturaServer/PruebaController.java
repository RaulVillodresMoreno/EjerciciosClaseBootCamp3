package com.nttdata.bootcamp.temperaturaServer;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.temperaturaidioma.domain.Temperatura;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class PruebaController {
	

	@Autowired
	private Temperatura temperatura;
	
	private Counter counter;
	
	public PruebaController(MeterRegistry registry) {
        this.counter = Counter.builder("invocaciones.temperatura").description("Invocaciones totales").register(registry);
    }
		
	@GetMapping(path="/prueba")
	public String conversionTemperatura() {
		return temperatura.getTemperatura();
	}

@GetMapping(path="/helloWorld")
    public String helloWorld() {
        counter.increment();
        return "hello World";
    }
}
