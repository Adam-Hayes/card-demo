package com.example.carddemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.carddemo.entity.CardEntity;

public interface CardRepository extends JpaRepository<CardEntity,Long> {
}
