package progettiSpring.simpleCrud.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="ruoli")
public class Ruolo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=30, unique=true, nullable=false)
	private String nome_ruolo;
	
	@OneToMany(mappedBy="ruolo", fetch=FetchType.LAZY)
	private List <Account> accounts;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getNome_ruolo() {
		return nome_ruolo;
	}
	public void setNome_ruolo(String nome_ruolo) {
		this.nome_ruolo = nome_ruolo;
	}
	public List <Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List <Account> accounts) {
		this.accounts = accounts;
	}
}
