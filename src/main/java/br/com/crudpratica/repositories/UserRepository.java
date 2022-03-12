package br.com.crudpratica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crudpratica.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
