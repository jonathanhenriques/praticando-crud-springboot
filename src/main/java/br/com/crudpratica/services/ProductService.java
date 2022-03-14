package br.com.crudpratica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crudpratica.entities.Product;
import br.com.crudpratica.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository categoryRepository;
	
	public List<Product> findAll(){
		return categoryRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> category = categoryRepository.findById(id);
		return category.get();
	}

}
