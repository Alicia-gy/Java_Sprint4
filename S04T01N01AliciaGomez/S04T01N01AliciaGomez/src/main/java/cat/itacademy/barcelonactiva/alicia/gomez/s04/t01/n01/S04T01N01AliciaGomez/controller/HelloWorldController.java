package cat.itacademy.barcelonactiva.alicia.gomez.s04.t01.n01.S04T01N01AliciaGomez.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(value = "name", defaultValue = "Unknown") String name) {
		return "Hola " + name + ". Estas ejecutando un proyecto Maven";
	}
	
	@GetMapping({"/HelloWorld2", "HelloWorld2/{name}"})
	public String saluda2(@PathVariable(required = false) String name) {
		if(name == null) {
			name = "Unknown";
		}
		return "Hola " + name + ". Estas ejecutando un proyecto Maven";
	}

}
