package cat.itacademy.barcelonactiva.alicia.gomez.s04.t02.n02.S04T02N02AliciaGomez.model.services;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.alicia.gomez.s04.t02.n02.S04T02N02AliciaGomez.model.domain.Fruita;

public interface FruitaService {
	
	public Fruita save(Fruita fruita);
	
	public void deleteById(int id);
	
	public Optional<Fruita> findById(int id);
	
	public List<Fruita> findAll();
	
	
	

}
