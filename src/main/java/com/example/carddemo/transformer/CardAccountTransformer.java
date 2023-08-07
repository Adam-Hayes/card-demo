package com.example.carddemo.transformer;

import org.springframework.stereotype.Component;
import com.example.carddemo.dto.request.CardAccountRequestDto;
import com.example.carddemo.dto.response.CardAccountResponseDto;
import com.example.carddemo.enums.AccountType;
import com.example.carddemo.model.CardAccount;

@Component
public class CardAccountTransformer {

    public CardAccount toCardAccount(final CardAccountRequestDto cardAccountRequest){
        return CardAccount.builder()
                .accountNumber(cardAccountRequest.getAccountNumber())
                .accountType(AccountType.valueOf(cardAccountRequest.getAccountType()))
                .balance(Double.valueOf(cardAccountRequest.getBalance()))
                .build();
    }

    public CardAccountResponseDto toCardAccount(final CardAccount cardAccount){
        return CardAccountResponseDto.builder()
                .id(cardAccount.getId())
                .accountNumber(cardAccount.getAccountNumber())
                .accountType(cardAccount.getAccountType())
                .balance(cardAccount.getBalance())
                .build();
    }
}
