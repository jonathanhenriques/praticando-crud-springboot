package br.com.crudpratica.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crudpratica.entities.Order;
import br.com.crudpratica.services.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> order = service.findAll();
		return ResponseEntity.ok().body(order);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order order = service.findById(id);
		return ResponseEntity.ok().body(order);
	}

}
