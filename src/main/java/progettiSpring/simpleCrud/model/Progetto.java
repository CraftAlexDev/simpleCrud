package progettiSpring.simpleCrud.model;

import java.util.List;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Setter @Getter
@ToString @EqualsAndHashCode
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
}
