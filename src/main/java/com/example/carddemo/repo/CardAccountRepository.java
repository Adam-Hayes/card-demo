package com.example.carddemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.carddemo.model.CardAccount;

public interface CardAccountRepository extends JpaRepository<CardAccount,Long> {
}
