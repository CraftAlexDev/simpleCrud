package progettiSpring.simpleCrud.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Setter @Getter
@ToString @EqualsAndHashCode
@Table(name="accounts")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id_ruolo", referencedColumnName="id")
	private Ruolo ruolo;
	
	@OneToOne(mappedBy="account", cascade=CascadeType.ALL) //cascade.all serve se un utente viene cancellato anche account subisce.
	private Utente utente;
	
	@Column(length=30, unique=true, nullable=false)
	private String username;
	
	@Column(length=30, nullable=false)
	private String password;
	
	@Column(length=50, unique=true, nullable=false)
	private String email;
}
