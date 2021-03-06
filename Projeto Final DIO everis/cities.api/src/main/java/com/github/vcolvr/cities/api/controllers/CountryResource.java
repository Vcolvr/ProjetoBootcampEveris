package com.github.vcolvr.cities.api.controllers;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.vcolvr.cities.api.entities.Country;
import com.github.vcolvr.cities.api.repositories.CountryRepository;

@RestController
public class CountryResource {

	private final CountryRepository repository;

	public CountryResource(final CountryRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/countries")
	public Page<Country> countries(Pageable page) {
		return repository.findAll(page);
	}

	@GetMapping
	public ResponseEntity<Country> getOne(@PathVariable Long id) {
		Optional<Country> country = repository.findById(id);
		
		if(country.isPresent()) {
			return ResponseEntity.ok().body(country.get());
		}
		else {
			return ResponseEntity.notFound().build();
		}
		
	}
}
