package com.example.carddemo.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.carddemo.entity.PersonEntity;


public interface PersonRepository extends JpaRepository<PersonEntity,Long> {

    Optional<PersonEntity> findById(Long id);
}
