package com.example.carddemo.services;

import com.example.carddemo.dto.request.CardAccountRequestDto;
import com.example.carddemo.dto.response.CardAccountResponseDto;

public interface CardAccountService {

    CardAccountResponseDto createCardAccount(CardAccountRequestDto cardAccountRequest);
    CardAccountResponseDto getCardAccount(Long personId,Long cardAccountId);

    void deleteCardAccount(Long personId,Long cardAccountId);
}
