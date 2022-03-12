package br.com.crudpratica.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crudpratica.entities.User;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
	
	
	@GetMapping
	public ResponseEntity<User> finAll(){
		User u = new User(1L, "Maria", "maria@gmail.com","999999999", "12345");
		return ResponseEntity.ok().body(u);
	}
	
	

}
