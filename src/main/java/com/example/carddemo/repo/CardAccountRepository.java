package com.example.carddemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.carddemo.entity.CardAccountEntity;

public interface CardAccountRepository extends JpaRepository<CardAccountEntity,Long> {
}
