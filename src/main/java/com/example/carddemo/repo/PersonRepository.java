package com.example.carddemo.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.carddemo.model.Person;


public interface PersonRepository extends JpaRepository<Person,Long> {

    Optional<Person> findById(Long id);
}
