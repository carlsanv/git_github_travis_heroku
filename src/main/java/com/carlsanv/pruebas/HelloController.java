package com.carlsanv.pruebas;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	//https://spring.io/guides/gs/spring-boot/
	
    @RequestMapping("/helloController")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}