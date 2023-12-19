package cat.itacademy.barcelonactiva.Alicia.Gomez.s04.t01.n02.S04T01N02AliciaGomez.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(value = "name", defaultValue = "Unknown") String name) {
		return "Hola " + name + ". Estas ejecutando un proyecto Gradle";
	}
	
	@GetMapping({"/HelloWorld2", "HelloWorld2/{name}"})
	public String saluda2(@PathVariable(required = false) String name) {
		if(name == null) {
			name = "Unknown";
		}
		return "Hola " + name + ". Estas ejecutando un proyecto Gradle";
	}

}
