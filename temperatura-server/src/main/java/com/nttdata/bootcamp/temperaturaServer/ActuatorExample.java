package com.nttdata.bootcamp.temperaturaServer;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id="customEndPoint")
public class ActuatorExample {
	@GetMapping("/random")
	public ResponseEntity<String> customEndPoint(){
		return new ResponseEntity<>("Something from my controller", HttpStatus.OK);
	}
}