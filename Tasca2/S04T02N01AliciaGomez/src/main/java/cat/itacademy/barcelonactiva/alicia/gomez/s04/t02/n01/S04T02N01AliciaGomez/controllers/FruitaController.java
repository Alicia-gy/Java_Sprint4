package cat.itacademy.barcelonactiva.alicia.gomez.s04.t02.n01.S04T02N01AliciaGomez.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.alicia.gomez.s04.t02.n01.S04T02N01AliciaGomez.model.domain.Fruita;
import cat.itacademy.barcelonactiva.alicia.gomez.s04.t02.n01.S04T02N01AliciaGomez.model.services.FruitaService;

@RestController
@RequestMapping("/fruita")
public class FruitaController {
	
	@Autowired
	private FruitaService fruitaService;
	
	//create new
	@PostMapping("/add")
	public ResponseEntity<?> create (@RequestBody Fruita fruita){
		return ResponseEntity.status(HttpStatus.CREATED).body(fruitaService.save(fruita));
	}
	
	//read by id
	@GetMapping("/getOne/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") int id){
		Optional<Fruita> fruita = fruitaService.findById(id);
		
		if(!fruita.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(fruita);
	}
	
	//read all
	@GetMapping("/getAll")
	public List<Fruita> readAll() {
		return fruitaService.findAll();
	}
	
	//update
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@RequestBody Fruita fruitaDetails, @PathVariable(value = "id") int id) {
		Optional<Fruita> fruita = fruitaService.findById(id);
		
		if(!fruita.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		fruita.get().setNom(fruitaDetails.getNom());
		fruita.get().setQuilos(fruitaDetails.getQuilos());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(fruitaService.save(fruita.get()));
		
	}
	
	//delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") int id){
		if(!fruitaService.findById(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		fruitaService.deleteById(id);
		return ResponseEntity.ok().build();
		
	}

}
