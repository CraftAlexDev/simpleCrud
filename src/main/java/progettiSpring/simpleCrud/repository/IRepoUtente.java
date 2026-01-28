package progettiSpring.simpleCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progettiSpring.simpleCrud.model.Utente;

@Repository
public interface IRepoUtente extends JpaRepository<Utente, Integer>{
	//save(T t) tipo di dato - nome dell'argomento
	//findAll() leggi tutti 
	//findbyID(int id) leggi da id
	public Utente findById(int id);
	//deletebyID(int id) rimuovi da ID
	//existsbyID(int id) verifica da ID
}
