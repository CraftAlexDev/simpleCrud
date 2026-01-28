package progettiSpring.simpleCrud.model;


import java.sql.Date;

import jakarta.persistence.*;

@Entity
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
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	
}
