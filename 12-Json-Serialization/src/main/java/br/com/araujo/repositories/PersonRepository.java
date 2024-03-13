package br.com.araujo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.araujo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{}
