package cat.itacademy.barcelonactiva.alicia.gomez.s04.t02.n01.S04T02N01AliciaGomez.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.alicia.gomez.s04.t02.n01.S04T02N01AliciaGomez.model.domain.Fruita;

@Repository
public interface FruitaRepository extends JpaRepository<Fruita, Integer> {
	
	

}
