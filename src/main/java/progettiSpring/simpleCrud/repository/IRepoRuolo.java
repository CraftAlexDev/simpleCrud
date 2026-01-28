package progettiSpring.simpleCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progettiSpring.simpleCrud.model.Ruolo;

@Repository
public interface IRepoRuolo extends JpaRepository<Ruolo, Integer>{

}
