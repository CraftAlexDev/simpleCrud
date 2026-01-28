package progettiSpring.simpleCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progettiSpring.simpleCrud.model.Account;

@Repository
public interface IRepoAccount extends JpaRepository<Account, Integer>{

}
