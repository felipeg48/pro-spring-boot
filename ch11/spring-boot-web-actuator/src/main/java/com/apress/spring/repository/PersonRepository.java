package com.apress.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.apress.spring.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}