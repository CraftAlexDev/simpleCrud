package progettiSpring.simpleCrud.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="progetti")
public class Progetto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(length=50, unique=true, nullable=false)
	private String progetto;

	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="cross_progetti_utenti",
			joinColumns=@JoinColumn(name="id_progetto"), //si riferisce alla classe in cui siamo
			inverseJoinColumns=@JoinColumn(name="id_utente") //si riferisce alla classe/tabella da collegare
			)
	private List<Utente> utenti;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProgetto() {
		return progetto;
	}

	public void setProgetto(String progetto) {
		this.progetto = progetto;
	}

	public List<Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(List<Utente> utenti) {
		this.utenti = utenti;
	}
	
}
