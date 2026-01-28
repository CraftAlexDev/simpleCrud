package progettiSpring.simpleCrud.model;

import jakarta.persistence.*;

@Entity
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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
