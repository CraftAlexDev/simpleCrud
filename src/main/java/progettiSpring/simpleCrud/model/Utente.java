package progettiSpring.simpleCrud.model;

import java.sql.Date;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Setter @Getter
@ToString @EqualsAndHashCode
@Table(name="utenti")
public class Utente {
	@Id
	//domanda da colloquio cos'è generation type= è un enum (struttura di sole costanti) non è una classe perchè non ha metodi.
	@GeneratedValue(strategy=GenerationType.IDENTITY) /*valori con cui decidi la strategia di incremento di aggiornamento di una chiave primaria */
	private int Id;
	@Column(length=30,nullable=false)
	private String nome;
	@Column(length=30,nullable=false)
	private String cognome;
	@Column
	private Date dataNascita;
	@Column(length=16,unique=true, nullable=false)
	private String cf;
	
	@OneToOne
	@JoinColumn(name="id_account", referencedColumnName="id")
	private Account account;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="cross_progetti_utenti",
			joinColumns=@JoinColumn(name="id_utente"), //si riferisce alla classe in cui siamo
			inverseJoinColumns=@JoinColumn(name="id_progetto") //si riferisce alla classe/tabella da collegare
			)
	private List<Progetto> progetti;	
}
