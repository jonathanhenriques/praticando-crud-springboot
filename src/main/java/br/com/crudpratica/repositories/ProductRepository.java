package br.com.crudpratica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crudpratica.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
