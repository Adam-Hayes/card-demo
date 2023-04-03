package com.example.carddemo.services;

import org.springframework.stereotype.Service;
import com.example.carddemo.dto.request.CardAccountRequestDto;
import com.example.carddemo.dto.response.CardAccountResponseDto;
import com.example.carddemo.model.CardAccount;
import com.example.carddemo.repo.CardAccountRepository;
import com.example.carddemo.transformer.CardAccountTransformer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CardAccountServiceImpl implements CardAccountService {
    private final CardAccountRepository cardAccountRepository;
    private final CardAccountTransformer cardAccountTransformer;


    @Override
    public CardAccountResponseDto createCardAccount(final CardAccountRequestDto cardAccountRequest) {
        CardAccount savedCardAccount = cardAccountRepository.save(cardAccountTransformer.toCardAccount(cardAccountRequest));
        return cardAccountTransformer.toCardAccount(savedCardAccount);
    }

    @Override
    public CardAccountResponseDto getCardAccount(final Long personId, final Long cardAccountId) {
        return null;
    }

    @Override
    public void deleteCardAccount(final Long personId, final Long cardAccountId) {

    }
}
