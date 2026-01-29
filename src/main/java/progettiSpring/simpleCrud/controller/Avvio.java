package progettiSpring.simpleCrud.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import progettiSpring.simpleCrud.model.Ruolo;
import progettiSpring.simpleCrud.model.Utente;
import progettiSpring.simpleCrud.repository.IRepoUtente;
//@Controller: gestiamo richieste in un'architerrura 3-tiers.(monolite=lavorano tutti e 3 insieme).
//@RestController: gestiamo richieste in un'architettura N-tiers.
@RestController
public class Avvio {
	@Autowired
	IRepoUtente iru;
	
	@GetMapping("/saluto")
	public String saluto() {
		return "Ciao";
	}
	@GetMapping("/saluto2")
	public String saluto(@RequestParam String parte1, String parte2) {
		return parte1 + " " + parte2;
	}
	@GetMapping("/upSert")
	public String upSert(Utente utente) {
		iru.save(utente);
		return "inserimento avvenuto con successo";
	}
	@GetMapping("/readAll")
	public List<Utente> readAll() {
		return iru.findAll();
	}
	@GetMapping("/readOne")
	public Utente readOne(@RequestParam int id) {
		return iru.findById(id);
	}
	@GetMapping("/remove")
	public String remove(@RequestParam int id) {
		iru.deleteById(id);
		return "rimozione avvenuta con successo";
	}
	public String test() {
		Ruolo ruolo = new Ruolo();	
		ruolo.setNome_ruolo("house");
		return "";
	}
}
