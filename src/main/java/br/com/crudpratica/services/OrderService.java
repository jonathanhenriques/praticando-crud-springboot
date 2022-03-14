package br.com.crudpratica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crudpratica.entities.Order;
import br.com.crudpratica.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

//	public OrderService() {
//
//	}
//
//	public OrderService(OrderRepository repository) {
//		this.repository = repository;
//	}

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
