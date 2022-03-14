package br.com.crudpratica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crudpratica.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
