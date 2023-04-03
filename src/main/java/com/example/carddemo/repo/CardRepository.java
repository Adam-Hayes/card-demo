package com.example.carddemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.carddemo.model.Card;

public interface CardRepository extends JpaRepository<Card,Long> {
}
