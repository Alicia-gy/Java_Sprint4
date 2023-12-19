package cat.itacademy.barcelonactiva.alicia.gomez.s04.t02.n01.S04T02N01AliciaGomez.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cat.itacademy.barcelonactiva.alicia.gomez.s04.t02.n01.S04T02N01AliciaGomez.model.domain.Fruita;
import cat.itacademy.barcelonactiva.alicia.gomez.s04.t02.n01.S04T02N01AliciaGomez.model.repository.FruitaRepository;

@Service
public class FruitaServiceImpl implements FruitaService {
	
	@Autowired
	private FruitaRepository fruitaRepository;
	
	@Override
	public Fruita save(Fruita fruita) {
		return fruitaRepository.save(fruita);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		fruitaRepository.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Fruita> findById(int id) {
		return fruitaRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Fruita> findAll() {
		return fruitaRepository.findAll();
	}

	

}
