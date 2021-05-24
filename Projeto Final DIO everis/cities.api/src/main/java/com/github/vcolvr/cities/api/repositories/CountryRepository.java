package com.github.vcolvr.cities.api.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.github.vcolvr.cities.api.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
