package br.com.crudpratica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crudpratica.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
