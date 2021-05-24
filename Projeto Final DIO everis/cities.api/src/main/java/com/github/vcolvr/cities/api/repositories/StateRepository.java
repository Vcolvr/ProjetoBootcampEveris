package com.github.vcolvr.cities.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.vcolvr.cities.api.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
