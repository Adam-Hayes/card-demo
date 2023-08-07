package com.example.carddemo.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.carddemo.model.CardAccount;

public interface CardAccountRepository extends JpaRepository<CardAccount, Long> {

    Optional<CardAccount> findByPersonIdAndId(Long personId, Long id);

}
