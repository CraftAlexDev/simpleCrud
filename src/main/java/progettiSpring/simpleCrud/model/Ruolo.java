package progettiSpring.simpleCrud.model;

import java.util.List;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Setter @Getter
@ToString @EqualsAndHashCode
@Table(name="ruoli")
public class Ruolo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=30, unique=true, nullable=false)
	private String nome_ruolo;
	
	@OneToMany(mappedBy="ruolo", fetch=FetchType.LAZY)
	private List <Account> accounts;
}
