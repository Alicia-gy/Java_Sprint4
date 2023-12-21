package cat.itacademy.barcelonactiva.alicia.gomez.s04.t02.n02.S04T02N02AliciaGomez.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruita")
public class Fruita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "quantitatQuilos")
	private int quantitatQuilos;
	
	public Fruita() {
		
	}
	
	public Fruita(String nom, int quantitatQuilos) {
		
		this.nom = nom;
		this.quantitatQuilos = quantitatQuilos;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getQuilos() {
		return quantitatQuilos;
	}
	
	public void setQuilos(int quantitatQuilos) {
		this.quantitatQuilos = quantitatQuilos;
	}

}
