package com.example.carddemo.repo;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.carddemo.model.Person;


public interface PersonRepository extends JpaRepository<Person,Long> {

    @Query("SELECT p from Person p left join fetch p.cardAccounts  where p.id = :personId")
    Optional<Person> findById(@Param(value = "personId") Long id);

    @Override
    Page<Person> findAll(Pageable pageable);
}
